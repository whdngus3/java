package jojo1;

public class LocalVariable {
	public static void main(String[] args) {
		int a = (int) (Math.random()*10);
		int b = (int) (Math.random()*10);
		boolean scope= a>b;
		if(scope) {
			int num=1;
			
			System.out.println(num);
	} else {
		int num=2;
		System.out.println(num);
	}
		
		simple();
	}

	public static void simple() {
		int num=3;
		System.out.println(num);
		
	}
}
