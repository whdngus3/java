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
		System.out.println("������ ��� ����:"+numOfApple);
		System.out.println("������ �����ܾ�:"+money);
		System.out.println("==================");
	}
}
