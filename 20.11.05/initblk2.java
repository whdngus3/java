package chap5;

public class initblk2 {
	int k;
	static {
		System.out.println("클래스 초기화 블럭");
		
	}
	{
		System.out.println("인스턴스 초기화 블럭");
		k=7;
	}
	public static void main(String[] args) {
		initblk2 ib1 = new initblk2();
		initblk2 ib2 = new initblk2();
		System.out.println("k = "+ib1.k);
		System.out.println("k = "+ib2.k);
	}
}
	
