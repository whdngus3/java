package jojo;

public class Account {
	private int total; //  통장개설하 때 입금액
	public Account(int total) {
		this.total = total;
	}
	//synchronized 동시에 예금 방지
	synchronized void deposit(int amt, String name) {
		total += amt;
		System.out.println(name+"입금:" + amt);
	}
	synchronized void withdraw(int amt, String name) {
		if (amt <= total) {
			total-=amt;
			System.out.println(name+"출금:" + amt);
		}else System.out.println("no money");
	}
	void print() {
		System.out.println("현제 잔액:"+total);
	}
}
