package jojo;

public class Account2User extends Thread{
	boolean flag;// c초기화안하면 False
	Account act;
	String name;
	public Account2User(Account act, String name) {
		super(name);
		this.act = act; this.name = name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			//계좌를 동시에 사용금지
			synchronized(act) {
				int amt= (int)(Math.random()*10000)+1;
				if(flag) act.deposit(amt,name);
				else act.withdraw(amt,name);	
			}
			flag = !flag;//현재 flag의 반대
			act.print();
		}
	}
}
