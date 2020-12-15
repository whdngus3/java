package chap5;

public class FruitBuyer1 {
	int numOfApple = 0;
	int money = 0;
	void buyFruit(FruitSeller1 fs, int amt) {
		int num = fs.saleApple(amt);
		money -= amt;
		numOfApple += num;
	}
	void print() {
		System.out.println("구매자 사과 갯수:"+numOfApple);
		System.out.println("구매자 현금잔액:"+money);
		System.out.println("==================");
	}
}
