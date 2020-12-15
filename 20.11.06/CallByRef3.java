package jojo1;

class B2{
	void swap(int[] x) {
		int a;
		a = x[0];
		x[0]=x[1];
		x[1]=a;
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}

public class CallByRef3 {
	public static void main(String[] args) {
		int[] x = {10,20};
		B2 b = new B2();
		b.swap(x);
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}
