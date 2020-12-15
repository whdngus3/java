package jojo1;

public class return3 {
	public static void main(String[] args) {
		
		int num=(int) (Math.random()*5)+1;
		m1(num);
		m2(num);
		
		
	}
	private static void m1(int num) {
		int k=0;
		while(true) {
			System.out.println("like that!");
			k++;
			if(num==k) break;
		}
	}
	
	private static void m2(int num) {
		double pi=3.14;
		System.out.println("¸éÀû: "+pi*num*num);
	}
}
