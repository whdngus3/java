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
		System.out.println("제목: "+title);
		System.out.println("저자: "+writer);
		System.out.println("대출자: "+name);
		System.out.println("대출일: "+date);
		System.out.println("===================");
	}
	public void checkIn() {
		if(state == SeperateVolume.NORMAL) return;
		state=SeperateVolume.NORMAL;
		System.out.println(title+"이 반납되었습니다.");
		name=""; date="";		

	}
	boolean stateInfo() {
		if(state==SeperateVolume.BORROWED) {
			System.out.println("대출된 책입니다.");
			return false;
		}else {
			System.out.println("대출 가능합니다.");
			return true;
		}
	}
	
}
