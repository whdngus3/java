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
			System.out.printf("%d°³ ÆÇ¸Å, ¼öÀÔ%d¿ø\n",num,amt);
		}else {
			System.out.println("»ç±¤¹þ¾î");
			num=0;
		}
		return num;
	}
	void print() {
		System.out.println(name+"»ç°ú°¹¼ö: "+numOfApple);
		System.out.println(name+"»ç°ú°¹¼ö: "+numOfApple);
	}
}
