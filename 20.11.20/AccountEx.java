package jojo;

public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000);
		AccountUser au1 = new AccountUser(act,"���ٴϿ�");
		AccountUser au2 = new AccountUser(act,"������ũ");
		AccountUser au3 = new AccountUser(act,"������ũ");
		AccountUser au4 = new AccountUser(act,"����ũ");
		AccountUser au5 = new AccountUser(act,"BTS");
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
	}
}
