package jojo;

import java.util.Arrays;
import java.util.List;

public class FilterEx1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("길동","길용","철수","오징어","길동");
		names.stream().distinct()  // 중복된 것 제거
		.forEach(n->System.out.println(n));
		System.out.println("=======");
		names.stream().filter(n->n.startsWith("길"))
		.forEach(n->System.out.println(n));
		System.out.println("=======");
		names.stream().distinct().filter(n->n.startsWith("길"))
		.forEach(n->System.out.println(n));
	}
}
