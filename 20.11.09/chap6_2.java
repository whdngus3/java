package chap5;

public class chap6_2 {
	private static chap6_2 instance = new chap6_2();
	private chap6_2() {}//매개변수 없는 생성자
	public static chap6_2 getInstance() {//static 클래스명. 메서드()사용가능
		return instance;
	}
}
