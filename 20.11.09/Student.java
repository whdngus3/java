package chap5;

public class Student {
	String name; int age; String sno;
	public Student(String name, int age, String sno) {
		this.name=name;this.age=age; this.sno=sno;
	}
	void print() {
		System.out.println("=================");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("�й�: "+sno);
		
	}
}
