package jojo1;


public class chap4_10 {
	public static void main(String[] args) {
	
		
		int[] k;
		k = new int[5];
		
		int[] i1= new int[10];
		k[0] = 31; k[1]=23; k[2] = 11;
		for (int i=0;i<5;i++) {
			System.out.println(k[i]);
		}
		for(int j:i1) {
			System.out.print(j);
		}
		
	}
}
