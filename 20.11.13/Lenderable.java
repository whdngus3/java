package chap5;

public interface Lenderable {
	int BORROWED = 1;
	int NORMAL = 0;
	void checkOut(String name, String date);
	void checkIn();
}

class SeperateVolume implements Lenderable{
	String title, writer,name,date;
	int state;
	public SeperateVolume(String title, String writer) {
		this.title = title; this.writer=writer;
	}
	public void checkOut(String name, String date) {
		if(sate == SeperateVolume.BORROWED) return;	
		this.name=name; this.date=date;
		System.out.println("����: "+title);
		System.out.println("����: "+writer);
		System.out.println("������: "+name);
		System.out.println("������: "+date);
		System.out.println("===================");
	}
	public void checkIn() {
		if(state == SeperateVolume.NORMAL) return;
		state=SeperateVolume.NORMAL;
		System.out.println(title+"�� �ݳ��Ǿ����ϴ�.");
		name=""; date="";		

	}
	boolean stateInfo() {
		if(state==SeperateVolume.BORROWED) {
			System.out.println("����� å�Դϴ�.");
			return false;
		}else {
			System.out.println("���� �����մϴ�.");
			return true;
		}
	}
	
}
