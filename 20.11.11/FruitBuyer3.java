package chap5;

public class FruitBuyer3 {
	String name;
	int numOfApple = 0;
	int money = 0;
	public FruitBuyer3(String name, int numOfApple,int money) {
		this.name=name; this.numOfApple=numOfApple; this.money=money;
		
	}
	void buyFruit(FruitSeller3 fs, int amt) {
		if(money<amt)System.out.println("µ·¾ø½´");
		else {
			int num=fs.saleApple(amt);
			if(num!=0) {
				money-=amt;
				numOfApple+=num;
				System.out.printf("»ç°ú %d°³ °Ù,ÁöÃâ %d!\n",num,amt);
			}
		}
	}
	void print() {
		System.out.println(name+"±¸¸ÅÀÚ »ç°ú °¹¼ö:"+numOfApple);
		System.out.println(name+"±¸¸ÅÀÚ Çö±ÝÀÜ¾×:"+money);
		System.out.println("==================");
	}
}
