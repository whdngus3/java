package jojo1;


public class chap4_14 {
	public static void main(String[] args) {
		int[][] i1 = {{21,34,45},{12,32,45}};
		
		
		int sum=0;
		System.out.println("����\t����\t����\t�հ�\t���");
		for(int i=0;i <i1.length;i++) {
			
			for(int j=0; j<i1[i].length;j++) {
				System.out.print(i1[i][j]+"\t");
				sum+=i1[i][j];
			}
			System.out.printf("%d\t%d",sum,sum/i1[i].length);
			sum=0;
			System.out.println();
		}}}
