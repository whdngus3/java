package chap5;

public abstract class Shape2 {
		abstract void computeArea();
	
}
class Circle2 extends Shape2{
	void computeArea() {
		System.out.println("원의 면적은" +3.14*10*10);
		
	}
	
}
class Rectangle2 extends Shape2{
	void computeArea() {
		System.out.println("사각혀으이 면적은"+10*10);
	}
}

class Triangle2 extends Shape2{
	void computeArea() {
		System.out.println("삼각형의 면적은"+10*10/2);
	}
}
