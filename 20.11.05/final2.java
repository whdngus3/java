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
		if (num==TRIANGLE) System.out.println("삼각형");
		else if (num==RECTANGLE) System.out.println("사각형");
		else if(num == CIRCLE)System.out.println("원");
		else System.out.println("1~3 사이 숫자가 아닙니다");
	}while(true);
	sc.close();
	System.out.println("end");
	
	
}
	
	
	
}


