package jojo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpre1 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("길동",80),new Student("철수",70),
			new Student("영이",60));
		Stream<Student> stream = list.stream();
		stream.forEach(s->{
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name+score);
		});
	}
}
