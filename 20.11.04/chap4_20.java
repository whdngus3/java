package jojo1;


public class chap4_20 {
	public static void main(String[] args) {
		

		System.out.println("����ǥ");
		
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.println("==============================================");
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};
		String[] name = {"�����ɽ�","��Ʈ","���ǿ�","�ҳ�ô�"};
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