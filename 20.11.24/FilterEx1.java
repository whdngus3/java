package jojo;

import java.util.Arrays;
import java.util.List;

public class FilterEx1 {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("�浿","���","ö��","��¡��","�浿");
		names.stream().distinct()  // �ߺ��� �� ����
		.forEach(n->System.out.println(n));
		System.out.println("=======");
		names.stream().filter(n->n.startsWith("��"))
		.forEach(n->System.out.println(n));
		System.out.println("=======");
		names.stream().distinct().filter(n->n.startsWith("��"))
		.forEach(n->System.out.println(n));
	}
}
