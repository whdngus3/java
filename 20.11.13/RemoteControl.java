package chap5;

public interface RemoteControl {
	int MAX_VOLUME=10;
	int MIN_VOLUME= 0;
	void turnOn();
	void turnOff();
	
	//default�� ����ϸ� �������θ� ���� �� �ִ�.
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("����ó��");
		} else {
			System.out.println("���� ����");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}

class Tv1 implements RemoteControl {
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
	}
}

class Radio1 implements RemoteControl {
	public void turnOn() {
		System.out.println("Radio�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("Radio�� ���ϴ�.");
	}
}