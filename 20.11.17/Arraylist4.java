package jojo;

import java.util.ArrayList;

public class Arraylist4 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("������");
		a1.add("�ȷ���");
		a1.add("ĥ����");
		a1.add("������");
		
		a1.add(2,"������"); prn(a1);
		
		a1.set(4,"������"); prn(a1);
		a1.remove(1); prn(a1);
	}

	private static void prn(ArrayList<String> a1) {
		for(String str:a1) {
			System.out.println(str);
		}
		System.out.println();
		
	}
}
