package chap5;


class D1 {
	int x =1000;
	void m1() {
		System.out.println("�� �θ�");
	}
}

class D2 extends D1{
	int x=2000;
	void m1() {
		D1 d = new D1();
		System.out.println("�θ�x1��: "+d.x);
		System.out.println("D2��x��: "+x);
		d.m1();
	}
}

public class Super2 {
	public static void main(String[] args) {
		D2 d2 = new D2();
		d2.m1();
	}

}
