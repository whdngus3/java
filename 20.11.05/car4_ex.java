package chap5;

public class car4_ex {
	public static void main(String[] args) {
		
		car4 c1 = new car4("가 1234",10,14);
		car4 c2 = new car4("나 1111",9,15);
		car4 c3 = new car4("다 2222",10,18);
		car4 c4 = new car4("라 3333",8,17);
		car4 c5 = new car4("마 4444",11,16);
		
				
				
				
		car4 [] cars={c1,c2,c3,c4,c5};
		
		for(car4 car:cars) {
			car.calculate();
			car.prn();
		}	
	}
}
