package jojo;

import java.util.Scanner;

public class AssertEx1 {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
				try{
					System.out.println("점수를 입력하세요");
					a=sc.nextInt();
					assert(a<100&& a>=0):"이상한 점수입니다.";
					System.out.println("점수: "+a);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				sc.close();
	}
}
