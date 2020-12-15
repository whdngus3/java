package jojo1;

public class return1 {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			int x=(int)(Math.random()*10);
			int y=(int)(Math.random()*10);
			System.out.println(i);
			cal(x,y);
	}
}

	static void cal(int x, int y) {
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		if(y==0)
			return;
		System.out.println(x/y);
		System.out.println("=============");
		
	}

}
