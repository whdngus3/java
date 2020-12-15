package chap5;

public class Manager extends Person {
	private String part;
	public Manager(String name, int age, String part) {
		setName(name); setAge(age); this.part=part;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	void printMa() {
		print();
		System.out.println("ºÎ¼­ :"+part);
	}

}
