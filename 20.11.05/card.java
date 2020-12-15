package chap5;

public class card {
	//static
	String kind; //instance
	int  number;
	static int width, height;//고정 클래스
	
	void disp() {
		System.out.println("==========================");
		System.out.println("종류: "+kind);
		System.out.println("숫자: "+number);
	}
	static void prn() {
		System.out.println("높이: "+height);
		System.out.println("넓이: "+width);
		
	
	}
	
}
