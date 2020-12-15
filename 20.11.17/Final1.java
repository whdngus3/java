package jojo;

public class Final1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			try {
				int num1= (int)(Math.random()*100);
				int num2= (int)(Math.random()*100);
				System.out.printf("%d / %d = %d\n",num1,num2,num1/2);
			} catch(Exception e) {
				System.out.println("0À¸·Î ¸ø³ö´²");
			} finally {
				System.out.println("¹«Á¶°ÇÃâ·Â");
			}
		}
	}
}
