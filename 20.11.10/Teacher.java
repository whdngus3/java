package chap5;

public class Teacher extends Person{
	private String major;
	public Teacher(String name, int age, String major) {
		setName(name);setAge(age);this.major=major;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	void printTh() {
		print();
		System.out.println("°ú¸ñ :"+major);
	}
	
}
