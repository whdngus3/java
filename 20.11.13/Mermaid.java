package chap5;



class Person{
	void speak() {
		System.out.println("���Ѵ�");
	}
}
interface Fish {
	void move(); 

}
public class Mermaid extends Person implements Fish{
	public void move() {
		System.out.println("�������̷� ���ģ��");
	}
	
}
