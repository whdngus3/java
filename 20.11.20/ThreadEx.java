package jojo;

public class ThreadEx implements Runnable{
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("-");
		}
	}
	
	public static void main(String[] args) {
		ThreadEx te = new ThreadEx();
		Thread th = new Thread(te);
		th.start();
	}
}
