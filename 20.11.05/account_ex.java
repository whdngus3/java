package chap5;

public class account_ex {
	public static void main(String[] args) {
		account ac1 = new account("½ÅÇÑ1234","ÀÌ¸¸Èñ",10000);
		account ac2 = new account("±¹¹Î1111","ÀÌ°ÇÈñ",10000);
		account ac3 = new account("³óÇù2222","ÀÌÅÂÈñ",10000);
		account ac4 = new account("¼öÇù4444","ÀÌÁ¤Èñ",10000);
		
		
		int money;
		for(int i = 0;i<10;i++) {
			money = (int)(Math.random()*12000);
			ac1.deposit(money);
			money = (int)(Math.random()*12000);
			ac1.withdraw(money);
			
		}
		ac1.disp();
		
	}
}
