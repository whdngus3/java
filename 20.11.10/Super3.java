package chap5;

class E1{
	E1() {System.out.println("�Ű����� ���� ������");
	
	}
	E1(String str){System.out.println("�Ű����� ����: "+str);
	
	}
	E1(int x){System.out.println("�Ű����� ����:"+x);
	
	}
	void m1() {System.out.println("�θ� �޼���");
	
	}
}
class E2 extends E1{
	E2(){System.out.println("�Ű���������");}
	E2(String msg){ System.out.println("���");
	
	}
	void disp() {System.out.println("��ȿ!!");
}
}

public class Super3 {
	public static void main(String[] args) {
		E2 e= new E2("��~"); e.m1();
		E2 e2= new E2();
		e2.disp();
	}
}


