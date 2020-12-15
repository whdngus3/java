package chap5;

public class circle {
	public static void main(String[] args) {
		final float PI = 3.1415f;
		int r=10;
		double area = PI*r*r;
		double round = 2*PI*r;
		
		System.out.println("원의 넓이= "+area);
		System.out.println("원의 둘레= "+round);
	}
}
