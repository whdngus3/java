package chap5;

public class flower {
	final int CARDNUM=20;
	int num;
	boolean isKwang;
	flower(int num, boolean isKwang){
		this.num=num; this.isKwang=isKwang;
	}
	
	public String toString() {
		return num +(isKwang?"±¤":"");	
	}
	public static void main(String[] args) {
		flower[] cards = new flower[CARDNUM];
		flower() {
			for(int i=0;i<cards.length;i++) {
				int num= i%10 + 1;
				boolean isKwang = (i<10) && (num==1||num==3||num==8);
				cards[i] = new flower(num,isKwang);
			}
		for(int i=0;i < cards.length;i++) {
			System.out.println(cards[i]);
		}
	}
	
}
