package chap5;

public class Teacher2 extends Person2{
	private String major;
	public Teacher2(String name, int age, String major) {
		super(name,age);
		this.major=major;
	}
	public String getPart() {
		return major;
	}
	public void setPart(String major) {
		this.major = major;
	}
	void printSt() {
		System.out.println("°ú¹¬ :"+major);
	}
}
