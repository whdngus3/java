package chap5;

public class car3 {
	String color;
	String kind;
	int displacement;
	car3() {}
	car3(String c){
		color=c;
	}
	car3(String c, String k){
		color=c; kind=k;
	}
	void disp() {
		System.out.println("=========");
		System.out.println("����: "+color);
		System.out.println("����: "+kind);
		System.out.println("��ⷮ: "+displacement);
		
	}
}
