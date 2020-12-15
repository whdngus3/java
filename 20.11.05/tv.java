package chap5;

public class tv {
	String color;
	boolean power;
	int channel;
	
	tv(String cr, boolean p, int ch){
		color=cr;power=p;channel=ch;
	}
	
	
	void prn() {
		System.out.println("===============");
		System.out.println("색깔: "+color);
		System.out.println("파워: "+power);
		System.out.println("채널: "+channel);
	}
}
