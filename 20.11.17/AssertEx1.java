package jojo;

import java.util.Scanner;

public class AssertEx1 {
	public static void main(String[] args) {
		int a = 0;
		Scanner sc = new Scanner(System.in);
				try{
					System.out.println("������ �Է��ϼ���");
					a=sc.nextInt();
					assert(a<100&& a>=0):"�̻��� �����Դϴ�.";
					System.out.println("����: "+a);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				sc.close();
	}
}
