package chap5;

public class car4 {
	String carno;
	int inTime;
	int outTime;
	int fee;
	final int PRICEPERHOUR = 3000;
	
	car4(String c,int it,int ot){
		carno=c; inTime=it; outTime=ot;
	}
	void calculate() {
		fee = (outTime-inTime)*PRICEPERHOUR;
	}
	void prn() {
		System.out.println("===========");
		System.out.println("������ȣ : "+carno);
		System.out.println("�԰�ð� : "+inTime);
		System.out.println("���ð� : "+outTime);
		System.out.println("������� : "+fee);
	}
}
