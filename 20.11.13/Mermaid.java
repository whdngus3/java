package chap5;



class Person{
	void speak() {
		System.out.println("말한다");
	}
}
interface Fish {
	void move(); 

}
public class Mermaid extends Person implements Fish{
	public void move() {
		System.out.println("지느러미로 헤엄친다");
	}
	
}
