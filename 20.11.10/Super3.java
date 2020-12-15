package chap5;

class E1{
	E1() {System.out.println("매개변수 없는 생성자");
	
	}
	E1(String str){System.out.println("매개변수 문자: "+str);
	
	}
	E1(int x){System.out.println("매개변수 숫자:"+x);
	
	}
	void m1() {System.out.println("부모 메서드");
	
	}
}
class E2 extends E1{
	E2(){System.out.println("매개변수없음");}
	E2(String msg){ System.out.println("대박");
	
	}
	void disp() {System.out.println("에효!!");
}
}

public class Super3 {
	public static void main(String[] args) {
		E2 e= new E2("헐~"); e.m1();
		E2 e2= new E2();
		e2.disp();
	}
}


