package jojo1;

class A1{
	public void m1(int x, int y) {
		x+=7;
		y+=5;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}



public class callByValue1 {
	public static void main(String[] args) {
		A1 a=new A1();
		int x=10, y=20;
		a.m1(x,y);
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
	}
}
