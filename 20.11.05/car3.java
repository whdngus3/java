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
		System.out.println("색깔: "+color);
		System.out.println("종류: "+kind);
		System.out.println("배기량: "+displacement);
		
	}
}
