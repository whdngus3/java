package chap5;

public abstract class Car {
	abstract void move();
	void print() {
		System.out.println("������ ������̳�");
	}
}

class Ambulance extends Car{
	void move(){
	System.out.println("ȯ�ڸ� �ư� �̵��Ѵ�");
	}
}

class FireEngine extends Car {
	void move() {
	System.out.println("���̷��� �︮�� �޸���");
	}
	void job() {
		System.out.println("�츮�� ���� ���� �־�");
	}
}

class Bus extends Car{
	void move() {
	System.out.println("40���� �ư� �̵��Ѵ�.");
	}
}
