package chap5;

public interface D1 {
	void m1();
}

interface D2{
	void m2();
}

class D3 implements D1, D2{
	public void m2() {
		System.out.println("우리집애완동물은 굼벵이");
	}
	public void m1() {
		System.out.println("강강강아지강강아지");
	}
}
