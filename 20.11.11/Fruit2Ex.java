package chap5;

public class Fruit2Ex {
	public static void main(String[] args) {
		FruitSeller2 fs1 = new FruitSeller2("전지현",30,1000);
		FruitSeller2 fs2 = new FruitSeller2("강동원",20,2000);
		FruitBuyer2 fb1 = new FruitBuyer2("강감찬",0,30000);
		FruitBuyer2 fb2 = new FruitBuyer2("김유신",5,20000);
		fb1.buyFruit(fs1, 3000);
		fb1.buyFruit(fs2, 2000);
		fb2.buyFruit(fs1, 2000);
		fs1.print();
		fs2.print();
		fb1.print();
		fb2.print();
	}
}
