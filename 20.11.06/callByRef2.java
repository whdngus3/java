package jojo1;

class B3{
	int x,y;
	public void bb(B3 b) {
	b.x+=10; b.y+=2;
	System.out.println("메인");
	System.out.println("x= "+b.x);
	System.out.println("y="+b.y );
}
}

public class callByRef2 {
	public static void main(String[] args) {
		B3 b = new B3();
		b.x = 8;
		b.y = 10;
		b.bb(b);
		System.out.println("메인");
		System.out.println("x= "+b.x);
		System.out.println("y="+b.y );
	}
}
