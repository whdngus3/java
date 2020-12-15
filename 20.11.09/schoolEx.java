package chap5;

public class schoolEx {
	public static void main(String[] args) {
		Student s1 = new Student("철수",25,"가1234");
		Student s2 = new Student("영이",22,"나1111");
		Manager m1 = new Manager("지숙",24,"clean");
		Manager m2 = new Manager("영순",24,"styling");
		Teacher t1 = new Teacher("재석",48,"java");
		Teacher t2 = new Teacher("명수",50,"python");
		s1.print(); s2.print();
		m1.print(); m2.print();
		t1.print(); t2.print();
	}
}
