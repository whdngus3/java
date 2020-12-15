package jojo1;


public class chap4_15 {
	public static void main(String[] args) {
		int d[][] = {{5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		int sum=0, asum=0;
		
		for(int i=0; i<d.length;i++) {
			for(int j=0; j<d[i].length;j++) {
				System.out.print(d[i][j]+"\t");
				sum+=d[i][j];
			}
			asum+=sum;
			System.out.println(sum);
		}
		System.out.println(asum);
		}
	}
