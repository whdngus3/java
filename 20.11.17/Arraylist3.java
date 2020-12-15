package jojo;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("»ç°ú"); a1.add("¼ö¹Ú"); a1.add("±Ö");
		a1.add("µþ±â");
		a1.set(2, "Æ÷µµ"); prn(a1);
	}

	private static void prn(ArrayList<String> a1) {
		for(String str:a1) {
			System.out.println(str);
		}
		
	}
}
