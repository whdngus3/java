package chap5;

public class account {
	String accountno,name;
	int balance;
	
	public account(String an,String n, int bal) {
		accountno = an; name = n; balance=bal;
	}
	
	
	void deposit(int money) {
		balance+=money;
		
		System.out.println(name+"�Ա�: "+money);
		
	}
	void withdraw(int money) {
		if (balance >= money) {
		balance-= money;
		System.out.println(name+"���: "+money);
		}
		else System.out.println("������");
	}
	
	void disp() {
		System.out.println("============");
		System.out.println("���¹�ȣ : "+accountno);
		System.out.println("������ : "+name);
		System.out.println("�ܾ� : "+balance);
		
	}
}
