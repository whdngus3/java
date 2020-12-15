package jojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpre1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("�浿",80),new Student("ö��",70),
			new Student("����",60));
		Stream<Student> stream = list.stream();
		stream.forEach(s->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name+score);
		});
	}
}
