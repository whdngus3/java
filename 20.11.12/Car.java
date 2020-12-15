package chap5;

public abstract class Car {
	abstract void move();
	void print() {
		System.out.println("오늘은 목요일이네");
	}
}

class Ambulance extends Car{
	void move(){
	System.out.println("환자를 싣고 이동한다");
	}
}

class FireEngine extends Car {
	void move() {
	System.out.println("사이렌을 울리면 달린다");
	}
	void job() {
		System.out.println("우리는 불을 끄고 있어");
	}
}

class Bus extends Car{
	void move() {
	System.out.println("40명을 싣고 이동한다.");
	}
}
