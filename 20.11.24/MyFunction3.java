package jojo;

interface MyFunctionInter3{
	int method(int x,int y);
}

public class MyFunction3 {
	public static void main(String[] args) {
		MyFunctionInter3 mi3;
		mi3 = (x,y) -> {
			int result = x+y;
			return result;
		};
		System.out.println(mi3.method(1, 2));
	}
}
