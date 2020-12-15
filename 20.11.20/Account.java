package jojo;

public class Account {
	private int total; //  ���尳���� �� �Աݾ�
	public Account(int total) {
		this.total = total;
	}
	//synchronized ���ÿ� ���� ����
	synchronized void deposit(int amt, String name) {
		total += amt;
		System.out.println(name+"�Ա�:" + amt);
	}
	synchronized void withdraw(int amt, String name) {
		if (amt <= total) {
			total-=amt;
			System.out.println(name+"���:" + amt);
		}else System.out.println("no money");
	}
	void print() {
		System.out.println("���� �ܾ�:"+total);
	}
}
