package jojo1;

import java.util.Scanner;

public class recu2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("자릿수 합계 구할 숫자 입력");
			int num= sc.nextInt();
			int hun = num/100;
			int ten = num%100/10;
			int one = num%10;
			
			System.out.println(hun+ten+one);
			if(num==0) break;
		} while(true); {
			System.out.println("프로그램 졸료");
			sc.close();
		}
	}
}
