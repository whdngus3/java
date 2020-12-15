package jojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SortingEx1 {
	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5,3,2,1,4});
		intStream.sorted().forEach(n-> System.out.print(n+","));
		System.out.println();
		List<Student2> list = Arrays.asList(
					new Student2("ȫ�浿",30),
					new Student2("�ſ��",10),
					new Student2("���̼�",10));
		list.stream().sorted().forEach(s -> System.out.print(s.getScore()+" "));
	}
}
