package jojo;

public class Account2Ex {
	public static void main(String[] args) {
		Account act = new Account(10000);
		Account2User au1 = new Account2User(act,"강다니엘");
		Account2User au2 = new Account2User(act,"제이핑크");
		Account2User au3 = new Account2User(act,"에이핑크");
		Account2User au4 = new Account2User(act,"블랙핑크");
		Account2User au5 = new Account2User(act,"BTS");
		au1.start();
		au2.start();
		au3.start();
		au4.start();
		au5.start();
	}
}
