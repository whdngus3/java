package chap5;

public class RemoteControlEx {
	public static void main(String[] args) {
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = new Tv1();
		rc[1] = new Radio1();
		for(RemoteControl i:rc) {
			i.turnOff();
			i.turnOn();
			i.setMute(true);
			RemoteControl.changeBattery();
		}
	}
}
