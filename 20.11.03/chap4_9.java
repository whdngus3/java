package jojo1;
import java.util.Scanner;


public class chap4_9 {
	public static void main(String[] args) {
		Scanner year =  new Scanner(System.in);
		while(true) {
			
			String str = year.nextLine();
			System.out.println("enter year");
			int iyear = Integer.parseInt(str);
			if (iyear==0) break;
			if (iyear%4==0 && iyear%100!=0) {
				if (iyear % 400==0) {
					System.out.println("����");
				}
				else System.out.println("���");
				
			}
			year.close();
		}
		
		System.out.println("����");
}
	
}
