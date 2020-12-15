package chap5;

public class chap5_2 {
	public static void main(String[] args) {
		//클래스명 객체명
		chap5_1 myCar = new chap5_1();//선언과 생성을 같이함
		chap5_1 yourCar;//객체 선언
		yourCar = new chap5_1();//객체 생성
		myCar.color="빨강";
		chap5_1 car1= new chap5_1();
		car1.color="초록";
		myCar.displacement = 1500;
		yourCar.color="노랑";
		yourCar.displacement=1500;
		myCar.print();
		yourCar.print();
		car1.print();
	}
	
}
