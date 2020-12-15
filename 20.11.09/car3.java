package chap5;


public class car3 {
	String color; int displacement;
	String kind;
	car3() {
		this("빨강");//생성자car3("빨깡"); 같은 클래스의 다른 생성자 호출
		System.out.println("no megae");
	}
	car3(String color){
		//생성자의 첫째줄에 this(...)가 있어야한다
		this(color,1500);
		this.color=color;
		System.out.println("1 megae "+color);
	}
	car3(String color,int displacement){
		
		this.color=color;
		this.displacement=displacement;
		System.out.println("2 megae"+color+","+displacement);
	}
	
	void prn() {
		System.out.println("색: "+color);
		System.out.println("배기량: "+displacement);
		System.out.println("종류: "+kind);
	}
	public static void main(String[] args) {
		car3 car= new car3("분홍",1300);
		car.kind="BMW";
	}

	
}

