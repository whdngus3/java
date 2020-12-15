package jojo1;


public class chap4_12 {
	public static void main(String[] args) {
	
		int[] a= new int[] {1,2,3,4,6,7,8,9,10};
		for(int i:a) {
			System.out.println(i);
		}		
		int s=0, avg=0,max=0,min=1;
	
	for(int i:a) {
		s+=i;
		if (max<i) {
			max = i;
		}
		if(min>i) {
			min=i;
		}
		
	}
	avg=s/a.length;
	System.out.printf("sum: %d,  avg: %d,  max: %d,  min: %d",s,avg,max,min);
	}
}
