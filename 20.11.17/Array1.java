package jojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("±∏∑∑¿Ã"); list.add("∆»∑∑¿Ã");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		for(String str:list) {
			System.out.println(str);
		}
	System.out.println();
	
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
		System.out.print(it.next());
	}
	}
	
	
}
