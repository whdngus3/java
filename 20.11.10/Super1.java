package chap5;

class C1 {
	int a1 = 7;
	void m1() {
		System.out.println("���");
	}
}

class C2 extends C1 {
	int a1 = 10;
	void m1() {
		System.out.println("ȭ����?");
		System.out.println("a1 = "+a1);
	}
}

public class Super1{
	public static void main(String[] args) {
		
	
	C2 c=new C2();
	c.m1();
	}
}
