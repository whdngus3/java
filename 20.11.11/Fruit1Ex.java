package chap5;

public class Fruit1Ex {
	public static void main(String[] args) {
		FruitSeller1 fs1 = new FruitSeller1();
		FruitSeller1 fs2 = new FruitSeller1();
		FruitBuyer1 fb1 = new FruitBuyer1();
		FruitBuyer1 fb2 = new FruitBuyer1();
		FruitBuyer1 fb3 = new FruitBuyer1();
		fb1.buyFruit(fs1, 3000);
		fb1.buyFruit(fs2, 2000);
		fb2.buyFruit(fs1, 2000);
		
		fs1.print();
		fs2.print();
		fb1.print();
		fb2.print();
		fb3.print();
		
	}
}
