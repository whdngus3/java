package chap5;

public class Shape {
	void draw() {
		System.out.println("�׸���");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("���� �׸���");
	}
	void disp() {
		System.out.println("�� �ձ���");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("�簢���� �׸���");
	}
}
