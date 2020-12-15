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
		System.out.println("차량번호 : "+carno);
		System.out.println("입고시간 : "+inTime);
		System.out.println("출고시간 : "+outTime);
		System.out.println("주차비용 : "+fee);
	}
}
