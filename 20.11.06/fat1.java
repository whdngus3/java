package jojo1;

import java.util.Scanner;

public class fat1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("��°�������");
			int num = sc.nextInt();
			if (num==0)break;
			System.out.println(+fat2(num));
		} while(true);
		sc.close(); System.out.println("���α׷� ����");
	}

	public static int fat(int num) {
		if(num==1) {
			System.out.print(1+"= ");
			return 1;
		}
		
		else {
			System.out.print(num+"X");
			return (num*fat(num-1));
		}
			
	}
	public static int fat2(int num) {
		int x= 1;
		for(int i=1; i<=num;i++) {
			System.out.print(i+"X");
			x*=i;
		}
		System.out.print("= ");
		return x;
	}
}
