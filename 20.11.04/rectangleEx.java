package chap5;

public class rectangleEx {
	public static void main(String[] args) {
		rectangle box1=new rectangle();
		rectangle box2=new rectangle();
		
		box1.width=100;
		box1.height=500;
		box2.width=200;
		box2.height=100;
		
		box1.area();
		box2.area();
	}
}
