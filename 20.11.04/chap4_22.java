package jojo1;


public class chap4_22 {
	public static void main(String[] args) {
		
		int temp;
		System.out.println("����ǥ");
		
		System.out.println("�̸�\t����\t����\t����\t����\t���\t�ְ�\t����");
		System.out.println("===============================================================");
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};
		String[] name = {"�����ɽ�","��Ʈ","���ǿ�","�ҳ�ô�"};
		for(int i=0;i<name.length;i++) {
			int sum=0;
		
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
				sum+=score[i][j];
			}
			
			for(int m = 0;m<score[i].length;m++) {
				for(int n=m+1;n<score[i].length;n++) {
					if(score[i][m]>score[i][n]) {
					temp=score[i][m];
					score[i][m]=score[i][n];
					score[i][n]=temp;
				}
			}
			}

			
			System.out.print(sum+"\t"+sum/score[i].length+"\t"+score[i][score[i].length-1]+"\t"+score[i][0]);
			System.out.println();
		}
		 
	}
}