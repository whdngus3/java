package chap5;

public class FruitSeller3 {
	String name;
	int numOfApple;
	int money;
	final int PRICEPERAPPLE = 1000;
	public FruitSeller3(String name, int numOfApple, int money) {
		this.name=name; this.numOfApple=numOfApple; this.money=money;
	}
	int saleApple(int amt) {
		int num= amt/PRICEPERAPPLE;
		if(numOfApple >= num) {
			money+=amt;
			numOfApple-=num;
			System.out.printf("%d�� �Ǹ�, ����%d��\n",num,amt);
		}else {
			System.out.println("�籤����");
			num=0;
		}
		return num;
	}
	void print() {
		System.out.println(name+"�������: "+numOfApple);
		System.out.println(name+"�������: "+numOfApple);
	}
}
