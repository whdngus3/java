package chap5;

public class FruitSeller2 {
	String name;
	int numOfApple;
	int money;
	final int PRICEPERAPPLE = 1000;
	public FruitSeller2(String name, int numOfApple, int money) {
		this.name=name; this.numOfApple=numOfApple; this.money=money;
	}
	int saleApple(int amt) {
		money+=amt;
		int num= amt/PRICEPERAPPLE;
		numOfApple -= num;
		return num;
	}
	void print() {
		System.out.println(name+"»ç°ú°¹¼ö: "+numOfApple);
		System.out.println(name+"»ç°ú°¹¼ö: "+numOfApple);
	}
}
