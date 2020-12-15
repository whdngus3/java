package chap5;

public class Manager {
	String name; int age; String part;
	public Manager(String name, int age, String part) {
		this.name=name;this.age=age;this.part=part;
	}
	void print() {
		System.out.println("=====================");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("부서: "+part);
	}
}
