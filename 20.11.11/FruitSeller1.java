package chap5;

public class FruitSeller1 {
	int numOfApple = 20;
	int money = 0;
	final int PRICEPERAPPLE = 1000;
	int saleApple(int amt) {
		money += amt;
		int num = amt/PRICEPERAPPLE;
		numOfApple -= num;
		return num;
		
	}
	void print() {
		System.out.println("�Ǹ��� ��� ����: "+numOfApple);
		System.out.println("�Ǹ��� ���� �ܾ�: "+money);
		System.out.println("==================");
	}
}
