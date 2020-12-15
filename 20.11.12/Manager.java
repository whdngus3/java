package chap5;

public class Manager extends Person2{
	private String part;
	public Manager(String name, int age, String part) {
		super(name,age);
		this.part=part;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	void printSt() {
		System.out.println("부서 :"+part);
	}
	void disp() {
		System.out.println("아이고난!");
	}
}
