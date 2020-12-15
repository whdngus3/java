package jojo;

public class UsingThis1Ex {
	public static void main(String[] args) {
		UsingThis1 ut = new UsingThis1();
		UsingThis1.Inner inner = ut.new Inner();
		inner.method();
	}
}
