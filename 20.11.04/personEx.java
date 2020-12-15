package chap5;

public class personEx {
	public static void main(String[] args) {
		Person p1= new Person();
		Person p2= new Person();
		
		p1.name="jack";
		p1.age=13;
		p1.addr="london";
		p2.name="losa";
		p2.age=23;
		p2.addr="volloa";
		
		p1.disp();
		p2.disp();
	}
}
