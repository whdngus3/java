package chap5;

public class outerEx {
	public static void main(String[] args) {
		
		outer out = new outer(10,10);
		outer.Inner inner = out.getInstance();
		System.out.println("부피: "+inner.volume());
		outer.Inner inner2 = out.new Inner();
		System.out.println("부피: "+inner2.volume());
	}
}
