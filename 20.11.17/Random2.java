package jojo;
import java.util.Random;


public class Random2 {
	public static void main(String[] args) {
		int[] number = new int[100];
		int[] count = new int[10];
		Random ran = new Random();
		for(int i=0;i<number.length;i++){
			number[i] = ran.nextInt(10);
			System.out.print(number[i]+" ");
			if(i%10 == 9) System.out.println();
			
		}
		for(int i=0;i<number.length;i++) {
			count[number[i]]++;
		}
		for(int i = 0;i<count.length;i++) {
			System.out.println(i+"ÀÇ °¹¼ö: "+printGraph('#',count[i])+" "+count[i]);
		}
	
		
	}
	private static String printGraph(char ch, int value) {
		char[] bar = new char[value];
		for(int i=0; i < bar.length;i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}
}
