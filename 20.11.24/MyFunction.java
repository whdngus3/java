package jojo;

interface MyFunctionInter1 {
	void method();
}

class MyFun1 implements MyFunctionInter1{
	public void method() {
		System.out.println(" �� �Լ��� ");
	}
}

public class MyFunction {
	public static void main(String[] args) {
		MyFunctionInter1 mi1 = new MyFun1();
		mi1.method();
		MyFunctionInter1 mi2 = new MyFunctionInter1() {
			public void method() {
				System.out.println("�䷸�� ����");
				
			}
		};
		mi2.method();
		MyFunctionainter1 mi3 = new MyFunctionInter1() {
			
			@Override
			public void method() {
				System.out.println(" �ϳ���");
				
			}
		mi3.method();
		myfucnctionin 
		
			
		};
	}

}
