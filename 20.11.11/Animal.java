package chap5;

public class Animal {
	void move() {
		System.out.println("move");
	}
	
}

class Pig extends Animal{
	void move() {
		System.out.println("4foot move");
	}
}
class Bird extends Animal{
	void move() {
		System.out.println("fly move");
	}
	void eat() {
		System.out.println("boori");
	}
}
class Fish extends Animal{
	void move() {
		System.out.println("fififishi");
	}
}


