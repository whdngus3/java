package chap5;

public class car2 {
	void drive() {
		System.out.println("운행한다");
		
	}
}
class FireEngine extends car2{
	void drive() {
		System.out.println("불을 끌 떄 운행한다");
	}
	void water() {
		System.out.println("물을 싣고다닌다");
	}
}

class Ambulance extends car2{
	void drive() {
		System.out.println("사이렌을 울리면 운행한다");
	}
}
