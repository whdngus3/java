package chap5;

public interface B1 {
	int A1 = 25;
	abstract void m1();
	void m2();
}
class B2 implements B1{
	public void m1() {
		System.out.println("������ ���");
	}
	public void m2() {
		System.out.println("������ ���,"+A1);
	}

}