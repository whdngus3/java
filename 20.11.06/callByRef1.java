package jojo1;

class A2{
	public void m1(int[] n) {
		n[1]=77;
		for(int i = 0; i< n.length; i++) {
			System.out.println(n[i]);
		}
		System.out.println();
	}
	
}

public class callByRef1 {
	public static void main(String[] args) {
		int[] n = {12,45,67};
		A2 a1 = new A2();
		a1.m1(n);
		for (int i:n) {
			System.out.println(i);
		}
		
		
	}

}
