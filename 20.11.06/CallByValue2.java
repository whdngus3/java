package jojo1;

class B1{
	void swap(int x, int y) {
		int a;
		a= x;
		x = y;
		y = a;
		System.out.println("x= "+x+",y= "+y);
	}
}
public class CallByValue2 {
	public static void main(String[] args) {
		
		int x = 10, y =20;
		B1 b = new B1();
		b.swap(x,y);
		System.out.println("x= "+x+",y= "+y);
	}
}
