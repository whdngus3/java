package chap5;

public class account_ex {
	public static void main(String[] args) {
		account ac1 = new account("����1234","�̸���",10000);
		account ac2 = new account("����1111","�̰���",10000);
		account ac3 = new account("����2222","������",10000);
		account ac4 = new account("����4444","������",10000);
		
		
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
