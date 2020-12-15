package chap5;

public class final1 {
	//final 은 값을 변겨하지 말라는 의미
	//final 은 변수명을 전부 대문자로 쓰는 것을 권장
	int max=100;
	final int min = 200;
	public static void main(String[] args) {
		final1 f1 = new final1();
		System.out.println("max = "+f1.max);
		System.out.println("min = "+f1.min);
		f1.max = 120;
		
	}
	
}
