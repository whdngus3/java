package chap5;

public class PersonEx {
	public static void main(String[] args) {
		Person2[] ps = new Person2[6];
		ps[0] = new Student2("����ũ",25,"��11");
		ps[1] = new Student2("������ũ",15,"��11");
		ps[2] = new Student2("�����ɽ�",55,"��11");
		ps[3] = new Student2("�ҳ�ô�",45,"��11");
		ps[4] = new Manager("Ʈ���̽�",65,"û��");
		ps[5] = new Student2("�����",85,"��11");
		for(Person2 p:ps) {
			p.printSt();
			if(p instanceof Manager)
				((Manager)p).disp();
		}
	}
}
