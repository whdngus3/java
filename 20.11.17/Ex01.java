package jojo;

public class Ex01 {
	public static void main(String[] args) {
		method(true);
		System.out.println();
		method(false);
	}
	public static void method(boolean b) {
		try {System.out.println(1);
		if (b) throw new ArithmeticException();
		System.out.println(2);
		} catch(RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {System.out.println(5);
	}System.out.println(6);
}
}
