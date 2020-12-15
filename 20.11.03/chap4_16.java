package jojo1;
import java.util.Scanner;

public class chap4_16 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("input won");
		int won = num.nextInt();
		
		int fmilion=0, milion=0,fthou=0,thou=0,hun=0;
		fmilion= (won/50000);	
		won -= fmilion*50000;
	
		milion= (won/10000);	
		won -= milion*10000;
		
		fthou= (won/5000);	
		won -= fthou*5000;
		
		thou= (won/1000);	
		won -= thou*1000;

		hun= (won/100);	
		won -= hun*100;
	
		
		System.out.println("5만원\t만원\t5천원\t천원\t백원");
		System.out.println(fmilion+"\t"+ milion+"\t"+ fthou+"\t"+ thou+"\t"+ hun);
		
		
		}
	}
