package chap5;


class D1 {
	int x =1000;
	void m1() {
		System.out.println("난 부모");
	}
}

class D2 extends D1{
	int x=2000;
	void m1() {
		D1 d = new D1();
		System.out.println("부모x1값: "+d.x);
		System.out.println("D2의x값: "+x);
		d.m1();
	}
}

public class Super2 {
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.m1();
	}

}
