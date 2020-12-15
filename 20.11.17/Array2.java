package jojo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Array2 {
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("사과");
		list.add("바나나");
		list.add("귤");
		list.add("오렌지");
		list.add("파인애플");
		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}
