package chap5;

public class chap6_2ex {
	public static void main(String[] args) {
		chap6_1 p1 = new chap6_1();
		chap6_1 p2 = new chap6_1();
		chap6_1 p3 = new chap6_1();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		chap6_2 c1 = chap6_2.getInstance();
		chap6_2 c2 = chap6_2.getInstance();
		chap6_2 c3 = chap6_2.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}

