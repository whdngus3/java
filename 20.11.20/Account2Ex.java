package jojo;

public class Account2Ex {
	public static void main(String[] args) {
		Account act = new Account(10000);
		Account2User au1 = new Account2User(act,"���ٴϿ�");
		Account2User au2 = new Account2User(act,"������ũ");
		Account2User au3 = new Account2User(act,"������ũ");
		Account2User au4 = new Account2User(act,"����ũ");
		Account2User au5 = new Account2User(act,"BTS");
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
	}
}
