package chap5;

public interface D1 {
	void m1();
}

interface D2{
	void m2();
}

class D3 implements D1, D2{
	public void m2() {
		System.out.println("�츮���ֿϵ����� ������");
	}
	public void m1() {
		System.out.println("������������������");
	}
}
