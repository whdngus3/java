package jojo1;

public class chap5_1 {
	public static void main(String[] args) {
		int num =(int)Math.random()*10+1;
		
		m1(num);
		m2(7,12);
	
	}
	
	//default 같은 클래스내 또는 같은 패키지 내 사용 가능
static void m2(int x, int y) {
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	
		
	}
	
	private static void m1(int num) {
		for(int i=0;i<num;i++) {
			System.out.println("안녕하세요");
	}
		
		
	}
}
