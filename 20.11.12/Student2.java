package chap5;
	
public class Student2 extends Person2{
	private String sno;
	public Student2(String name, int age, String sno) {
	super(name,age);this.sno=sno;
}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	void printSt() {
		super.printSt();
		System.out.println("ÇÐ¹ø :"+sno);
	}

}
