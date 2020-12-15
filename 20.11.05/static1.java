package chap5;

public class static1 {
	int x=0;
	static int y=0;
	public static1() {
		x++;
		y++;
		System.out.println("x= "+x+",y ="+y);
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			new static1();
		}
	}
}
