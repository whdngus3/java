package jojo1;


public class chap4_13 {
	public static void main(String[] args) {
		int temp=0;
		int[] a= new int[] {100,84,23,68,57,21,45};
		for(int i =a.length-1;i>=0;i--) {
			for(int j=a.length-(i+1);j>=0;j--) {
				if(a[i]>a[j]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int k:a) {
			System.out.println(k);
		}
		
	}
}
