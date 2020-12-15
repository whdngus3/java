package chap5;

public class Student {
	String name; int age; String sno;
	public Student(String name, int age, String sno) {
		this.name=name;this.age=age; this.sno=sno;
	}
	void print() {
		System.out.println("=================");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("학번: "+sno);
		
	}
}
