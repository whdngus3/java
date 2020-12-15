package jojo1;

public class chap4_3 {
	public static void main(String[] args) {
		for (int i = 5;i>0;i--) {
			
			int k = 5-i;
			while (k>0) {
				System.out.print(" ");
				k--;
			}
			for (int j = 0;j<i;j++) {
				
				System.out.print("*");
			}
			System.out.println();	
			}
			
	}
}
