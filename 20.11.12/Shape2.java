package chap5;

public abstract class Shape2 {
		abstract void computeArea();
	
}
class Circle2 extends Shape2{
	void computeArea() {
		System.out.println("���� ������" +3.14*10*10);
		
	}
	
}
class Rectangle2 extends Shape2{
	void computeArea() {
		System.out.println("�簢������ ������"+10*10);
	}
}

class Triangle2 extends Shape2{
	void computeArea() {
		System.out.println("�ﰢ���� ������"+10*10/2);
	}
}
