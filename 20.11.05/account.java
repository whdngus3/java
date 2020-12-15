package chap5;

public class account {
	String accountno,name;
	int balance;
	
	public account(String an,String n, int bal) {
		accountno = an; name = n; balance=bal;
	}
	
	
	void deposit(int money) {
		balance+=money;
		
		System.out.println(name+"입금: "+money);
		
	}
	void withdraw(int money) {
		if (balance >= money) {
		balance-= money;
		System.out.println(name+"출금: "+money);
		}
		else System.out.println("돈없어");
	}
	
	void disp() {
		System.out.println("============");
		System.out.println("계좌번호 : "+accountno);
		System.out.println("예금주 : "+name);
		System.out.println("잔액 : "+balance);
		
	}
}
