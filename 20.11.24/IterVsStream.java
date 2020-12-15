package jojo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IterVsStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("�浿","ö��","�ϴ�","���ϴ�");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
		System.out.println("==============");
		Stream<String> stream = list.stream();
		stream.forEach(name -> System.out.println(name));
	}
}
