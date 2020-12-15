package chap5;

public class Shape {
	void draw() {
		System.out.println("그리다");
	}
}

class Circle extends Shape{
	void draw() {
		System.out.println("원을 그리다");
	}
	void disp() {
		System.out.println("난 둥굴어");
	}
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("사각형을 그리다");
	}
}
