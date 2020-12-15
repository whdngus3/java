package jojo;

interface MyFunctionInter4{
	int method(int x, int y);
}

public class UsingThis1 {
	int outField = 20;
	class Inner{
		int innerField=10;
		void method() {
			MyFunctionInter4 fi;
			fi = ()->{
				System.out.println(UsingThis1.this.outField);
				System.out.println(this.innerField);
			};
			fi.method();
		}
		
	}
}
