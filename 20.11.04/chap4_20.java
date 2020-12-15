package jojo1;


public class chap4_20 {
	public static void main(String[] args) {
		

		System.out.println("성적표");
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==============================================");
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};
		String[] name = {"원더걸스","비스트","투피엠","소녀시대"};
		for(int i=0;i<name.length;i++) {
			int sum=0;
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j];
			}
			System.out.print(sum+"\t"+sum/score[i].length);
			System.out.println();
		}
		 
	}
}