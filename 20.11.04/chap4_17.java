package jojo1;


public class chap4_17 {
	public static void main(String[] args) {
		int [][] i1 = new int[2][];
		
		i1[0]= new int[3];
		i1[1]= new int[3];
		i1[0][0]=0;
		i1[0][1]=23;
		i1[0][2]=45;
		i1[1][0]=67;
		i1[1][1]=78;
		i1[1][2]=97;
		
		
	
		 for(int i=0;i <i1.length;i++) { for (int j=0;j<i1[i].length;j++) {
		 System.out.print(i1[i][j]+"\t"); } System.out.println(); }
		 
	}
}