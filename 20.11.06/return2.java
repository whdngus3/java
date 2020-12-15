package jojo1;

public class return2 {
	public static void main(String[] args) {
		
		for (int i=0; i<5;i++) {
			int x=(int) (Math.random()*10);
			int y=(int) (Math.random()*10);
			int kk = m1(x,y);
			System.out.println(kk);
			
			
			
		}
	}

	private static int m1(int x, int y) {
		
		int result = x+y;
		return result;
		
		
	}
}
