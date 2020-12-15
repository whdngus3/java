package chap5;

public class A1 {
	int a1=10;
	A1() {System.out.println("parents");}
	void m1() {System.out.println("p.method");
	}
	
}
class A2 extends A1{
	A2() {System.out.println("kid seng");}
	int a2=7;
	void m2() {
		System.out.println("kid method");
	}
}

