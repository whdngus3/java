package chap5;

public class RemoteControl2Ex {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOff() {
				System.out.println("����Ŀ ��");
				
			}
			public void turnOn() {
				System.out.println("����Ŀ ��");
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
		
	}
}
