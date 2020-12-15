package jojo;

interface MyFunctionInterface2{
	void method(int x);
}

public class MyFunctionInter2 {
	public static void main(String[] args) {
		MyFunctionInterface2 fi;
		fi=(x) ->{
			int result = x*5;
			System.out.println(result);
		};
		fi.method(5);
		fi = (x) -> {System.out.println(x*10);};
		fi.method(10);
		fi = x-> System.out.println(x*20);
		fi.method(20);
		}
	}

