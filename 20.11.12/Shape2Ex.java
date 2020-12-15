package chap5;

public class Shape2Ex {
	public static void main(String[] args) {
		Shape2[] shs = new Shape2[3];
		shs[0] = new Circle2();
		shs[1] = new Rectangle2();
		shs[2] = new Triangle2();
		
		for(Shape2 sh:shs) {
			sh.computeArea();
		}
	}
}
