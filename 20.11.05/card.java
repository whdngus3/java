package chap5;

public class card {
	//static
	String kind; //instance
	int  number;
	static int width, height;//���� Ŭ����
	
	void disp() {
		System.out.println("==========================");
		System.out.println("����: "+kind);
		System.out.println("����: "+number);
	}
	static void prn() {
		System.out.println("����: "+height);
		System.out.println("����: "+width);
		
	
	}
	
}
