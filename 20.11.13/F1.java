package chap5;

public interface F1 {
	void m1();
}

interface F2 extends F1{
	void m2();
}

interface F3 {
	void m3();
}
interface F4 extends F2,F3{
	void m4();
}


interface F5 {
	void m5();
}

class F6 implements F4,F5{
	public void m1() {
		System.out.println("»êµþ±â");
	}
	public void m2() {
		System.out.println("Áýµþ±â");
	}
	public void m3() {
		System.out.println("ÆÇµþ±â");
	}
	public void m4() {
		System.out.println("Á×Àº µþ±â");
	}
	public void m5() {
		System.out.println("¾ËÄ«¸® µþ±â");
	}
	
}