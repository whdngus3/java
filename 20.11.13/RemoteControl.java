package chap5;

public interface RemoteControl {
	int MAX_VOLUME=10;
	int MIN_VOLUME= 0;
	void turnOn();
	void turnOff();
	
	//default를 사용하며 ㄴ구현부를 만들 수 있다.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

class Tv1 implements RemoteControl {
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
}

class Radio1 implements RemoteControl {
	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}
	public void turnOff() {
		System.out.println("Radio를 끕니다.");
	}
}