package jojo1;


public class chap4_18 {
	public static void main(String[] args) {
		
		int[] i1= {12,34,56};
		int[] i2=new int[3];
		int[] i3=new int[3];
		i2=i1;
		System.arraycopy(i1,0,i3,0,i1.length);
		i1[0]=55;
		for(int j:i2) {
			System.out.println(j);
		}
		for(int j:i3) {
			System.out.println(j);
		}
		
		 
	}
}