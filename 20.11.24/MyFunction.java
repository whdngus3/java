package jojo;

interface MyFunctionInter1 {
	void method();
}

class MyFun1 implements MyFunctionInter1{
	public void method() {
		System.out.println(" 난 함수다 ");
	}
}

public class MyFunction {
	public static void main(String[] args) {
		MyFunctionInter1 mi1 = new MyFun1();
		mi1.method();
		MyFunctionInter1 mi2 = new MyFunctionInter1() {
			public void method() {
				System.out.println("요렇게 되지");
				
			}
		};
		mi2.method();
		MyFunctionainter1 mi3 = new MyFunctionInter1() {
			
			@Override
			public void method() {
				System.out.println(" 하나더");
				
			}
		mi3.method();
		myfucnctionin 
		
			
		};
	}

}
