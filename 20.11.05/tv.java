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
		System.out.println("����: "+color);
		System.out.println("�Ŀ�: "+power);
		System.out.println("ä��: "+channel);
	}
}
