package chap5;

public class Teacher {
	String name; int age; String major;
	public Teacher(String name, int age, String major) {
		this.name=name; this.age=age;this.major=major;
	}
	void print() {
		System.out.println("=================");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("����: "+major);
		
	}
}
