package chap5;

public class card2_ex {
	public static void main(String[] args) {
		card2 c1 = new card2();
		card2 c2 = new card2("heart");
		card2 c3 = new card2("heart",10);
		
		card2[] card= {c1,c2,c3};
		for(int i=0;i<card.length;i++) {
			card[i].disp();
		}
		System.out.println("--------------");
		
		
		for(card2 j:card) {
			j.disp();
		}
	}
}
