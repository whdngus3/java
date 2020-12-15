package chap5;

class B1 {
	B1(){System.out.println("난 할아버지");}
	int b1 = 12;
	void m1(){System.out.println("난 할아버지 메서드");}
}

class B2 extends B1{
	B2() {System.out.println("난 아버지");}
	int b2=22;
	void m2(){System.out.println("난 아버지 메서드");
	
	}
}
	
class B3 extends B2{
	B3(){System.out.println("난 아들");
	}
	int b3 = 33;
	void m3(){System.out.println("난 아들 메서드");}
}

public class Inher2 {
	public static void main(String[] args) {
		B3 b = new B3();
		System.out.println(b.b1);
		System.out.println(b.b2);
		System.out.println(b.b3);
		b.m1(); b.m2();
		b.m3();
	}
}
	


	