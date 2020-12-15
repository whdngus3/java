package chap5;

public class Student extends Person{
	private String sno;
	public Student(String name, int age, String sno) {
		setName(name); setAge(age);this.sno=sno;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno=sno;
	}
	void printSt() {
		print();
		System.out.println("ÇÐ¹ø :"+sno);
	}
}
