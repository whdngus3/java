package chap5;

public class car2 {
	void drive() {
		System.out.println("�����Ѵ�");
		
	}
}
class FireEngine extends car2{
	void drive() {
		System.out.println("���� �� �� �����Ѵ�");
	}
	void water() {
		System.out.println("���� �ư�ٴѴ�");
	}
}

class Ambulance extends car2{
	void drive() {
		System.out.println("���̷��� �︮�� �����Ѵ�");
	}
}
