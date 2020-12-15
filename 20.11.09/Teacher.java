package chap5;

public class Teacher {
	String name; int age; String major;
	public Teacher(String name, int age, String major) {
		this.name=name; this.age=age;this.major=major;
	}
	void print() {
		System.out.println("=================");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("과목: "+major);
		
	}
}
