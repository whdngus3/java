package chap5;
import java.util.Scanner;
public class final2 {
	
	public static void main(String[] args) {
		final int TRIANGLE = 1;
		final int RECTANGLE = 2;
		final int CIRCLE = 3;
		Scanner sc = new Scanner(System.in);
	do {
		System.out.println("input: ");
		int num=sc.nextInt();
		if(num==0)break;
		if (num==TRIANGLE) System.out.println("�ﰢ��");
		else if (num==RECTANGLE) System.out.println("�簢��");
		else if(num == CIRCLE)System.out.println("��");
		else System.out.println("1~3 ���� ���ڰ� �ƴմϴ�");
	}while(true);
	sc.close();
	System.out.println("end");
	
	
}
	
	
	
}


