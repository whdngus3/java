package first;

import java.util.Scanner;

public class ifelse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input 1~100: ");
		int jumsu = sc.nextInt();
		sc.close();
		
		
		char grade;
		
		if (jumsu > 90) {
			grade= 'A';
			
		} else if (jumsu >80) {
			grade = 'B';
			
		} else if (jumsu >70) {
			grade = 'C';
			
		} else grade='D';
		
		System.out.println(grade);
	} 

}
