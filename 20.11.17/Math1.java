package jojo;

public class Math1 {
	public static void main(String[] args) {
		double d1=Math.random()*10;
		System.out.println((int)d1+1);
		
		double d2 = 123.456;
		System.out.println(Math.ceil(d2));
		System.out.println(Math.floor(d2));
		System.out.println(Math.round(d2));
	}
}
