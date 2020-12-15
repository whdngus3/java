package jojo1;

public class chap4_7 {
	public static void main(String[] args) {
		int totalsum=0;
		for (int i =1; i<=10; i++) {
			int sum =0;
			for(int j = 1; j<=i; j++) {
				sum += j;
				
			}
			System.out.printf("%dÀÏ¶§: %d     ",i,sum);
			totalsum+=sum;
		}
		System.out.print(totalsum);
	}
	
}
