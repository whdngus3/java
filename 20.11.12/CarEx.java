package chap5;

public class CarEx {
	public static void main(String[] args) {
		Car[] car = new Car[3];
		car[0] = new Ambulance();
		car[1] = new FireEngine();
		car[2] = new Bus();
		
		
		for(Car c:car) {
			c.move();
			if(c instanceof FireEngine) {
				((FireEngine)c).job();
			}
		}
	}
	
}
