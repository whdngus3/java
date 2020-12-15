package chap5;

public class Fruit3Ex {
	public static void main(String[] args) {
		FruitSeller3 fs1 = new FruitSeller3("전지현",30,1000);
		FruitSeller3 fs2 = new FruitSeller3("강동원",20,2000);
		FruitBuyer3 fb1 = new FruitBuyer3("강감찬",0,30000);
		FruitBuyer3 fb2 = new FruitBuyer3("김유신",5,20000);
		fb1.buyFruit(fs1, 3000);
		fb1.buyFruit(fs2, 2000);
		fb2.buyFruit(fs1, 30000);
		fs1.print();
		fs2.print();
		fb1.print();
		fb2.print();
	}
}
