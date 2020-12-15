package chap5;

public class PersonEx {
	public static void main(String[] args) {
		Person2[] ps = new Person2[6];
		ps[0] = new Student2("블랙핑크",25,"가11");
		ps[1] = new Student2("에이핑크",15,"나11");
		ps[2] = new Student2("원더걸스",55,"다11");
		ps[3] = new Student2("소녀시대",45,"라11");
		ps[4] = new Manager("트와이스",65,"청소");
		ps[5] = new Student2("어벤져스",85,"바11");
		for(Person2 p:ps) {
			p.printSt();
			if(p instanceof Manager)
				((Manager)p).disp();
		}
	}
}
