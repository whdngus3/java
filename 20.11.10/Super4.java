package chap5;

class F1{
	F1(int x,int y){
		this(x);
		System.out.println(x);
		System.out.println(y);
		
	}
	F1(int x){
		this();
		System.out.println(x);
	}
	F1(){
		System.out.println("no magea");
	}
	void m1() {System.out.println("매게변수 연습");}
}

class F2 extends F1{
	F2(int x,int y){
		super(x,y);
		System.out.println("난 자식 생성자");
	}
}

public class Super4 {
	public static void main(String[] args) {
		F2 f= new F2(1,2);
		f.m1();
	}

}
