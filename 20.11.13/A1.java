package chap5;

//추상메서드: 모든 메서드가 실행부에 없음,abstract를 생략
//모든 멤버변수가 final형식임
public interface A1 {
	int a = 10;
	abstract void prn();
	void disp();
}


//interface를 사용할때는 implements
class A2 implements A1{
	public void prn() {
		System.out.println("A= "+A1.a);
		System.out.println("야호");
	}
	public void disp() {
		System.out.println("놀기딱좋아요");
	}
	
}