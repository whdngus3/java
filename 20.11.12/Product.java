package chap5;

public class Product {
	int price; int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	
	}
}
class Tv extends Product {
	Tv() {
		super(1000);
	}
	public String toString() {return "Tv";
	
	}
}
class ProductEx{
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println(t);
	}
}
