package chap5;

public class FruitBuyer2 {
	String name;
	int numOfApple = 0;
	int money = 0;
	public FruitBuyer2(String name, int numOfApple,int money) {
		this.name=name; this.numOfApple=numOfApple; this.money=money;
		
	}
	void buyFruit(FruitSeller2 fs, int amt) {
		int num = fs.saleApple(amt);
		money -= amt;
		numOfApple += num;
	}
	void print() {
		System.out.println(name+"구매자 사과 갯수:"+numOfApple);
		System.out.println(name+"구매자 현금잔액:"+money);
		System.out.println("==================");
	}
}
