package chap5;

public class carEx {
	public static void main(String[] args) {
		//포함된 객체를 먼저 생성함
		Engine eg1= new Engine(2000,"dohc");
		Engine eg2 = new Engine(3000,"ddid");
		Car c1 = new Car(eg1,"빨강");
		Car c2 = new Car(eg2,"노랑");
		Car c3 = new Car(eg1,"초록");
		Car[] cars = {c1,c2,c3};
		for(int i=0; i<cars.length;i++) {
			cars[i].print();
		}
	}
}
