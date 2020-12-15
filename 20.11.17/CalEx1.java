package jojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input 1 int");
		int num1= sc.nextInt();
		System.out.println("input 2 int");
		int num2= sc.nextInt();
		
		if (num1==0) {
			System.out.println("End");
		} else {
		try {
			System.out.println("/"+(num1/num2));
			System.out.println("+"+(num1+num2));
			System.out.println("+"+(num1-num2));
			System.out.println("*"+(num1*num2));
		} catch(ArithmeticException e) {
			System.out.println("0으로 못나눔");
		} catch(InputMismatchException e) {
			System.out.println("그게숫자냐?");
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	}
}
