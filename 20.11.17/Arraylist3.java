package jojo;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("���"); a1.add("����"); a1.add("��");
		a1.add("����");
		a1.set(2, "����"); prn(a1);
	}

	private static void prn(ArrayList<String> a1) {
		for(String str:a1) {
			System.out.println(str);
		}
		
	}
}
