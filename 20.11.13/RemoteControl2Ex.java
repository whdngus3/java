package chap5;

public class RemoteControl2Ex {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			public void turnOff() {
				System.out.println("스피커 켜");
				
			}
			public void turnOn() {
				System.out.println("스피커 꺼");
			}
		};
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		RemoteControl.changeBattery();
		
	}
}
