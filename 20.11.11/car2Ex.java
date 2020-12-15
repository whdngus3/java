package chap5;

public class car2Ex {
	public static void main(String[] args) {
		car2 car1 = new car2();
		FireEngine f1 = new FireEngine();
		car1.drive();
		f1.drive();
		f1.water();
		car2 car2 = f1;
		
		car2.drive();
		//car2.water();
		//Ambulance a1 = (Ambulance)car1;
		FireEngine f2 = (FireEngine)car2;
		f2.drive();
		car2 car3 = new Ambulance();
		car2[] cars= {car1,car2,car3};
		System.out.println("================");
		for(car2 car:cars) {
			car.drive();
			if(car instanceof FireEngine) {
				FireEngine fe1 = (FireEngine)car;
				fe1.water();
			}
			
		}
	}
}
