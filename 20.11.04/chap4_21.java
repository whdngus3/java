package jojo1;

import java.util.Scanner;


public class chap4_21 {
	public static void main(String[] args) {
		
		int[] lotto= new int[6];
		Scanner sc= new Scanner(System.in);
		int temp;
		System.out.println("input");
		int num=sc.nextInt();
		
		for(int i=0; i<num;i++) {
			System.out.println("원하는 번호?");
			lotto[i] = sc.nextInt();
		}
		System.out.println(num);
		for(int i=num;i<6;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j=i-1;j>=0;j--) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<lotto.length;i++) {
			for(int j=i+1;j<lotto.length;j++) {
				if (lotto[i]>lotto[j]) {
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		
		for(int j:lotto) {
			System.out.println(j);
		
		}
	}
}  