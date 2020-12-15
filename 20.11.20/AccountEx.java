package jojo;

public class AccountEx {
	public static void main(String[] args) {
		Account act = new Account(10000);
		AccountUser au1 = new AccountUser(act,"강다니엘");
		AccountUser au2 = new AccountUser(act,"제이핑크");
		AccountUser au3 = new AccountUser(act,"에이핑크");
		AccountUser au4 = new AccountUser(act,"블랙핑크");
		AccountUser au5 = new AccountUser(act,"BTS");
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
	}
}
