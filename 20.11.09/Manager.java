package chap5;

public class Manager {
	String name; int age; String part;
	public Manager(String name, int age, String part) {
		this.name=name;this.age=age;this.part=part;
	}
	void print() {
		System.out.println("=====================");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+age);
		System.out.println("�μ�: "+part);
	}
}
