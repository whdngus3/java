package chap5;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("ȭ��",25,"��11");
		Student st2 = new Student("����",31,"��22");
		Teacher th1 = new Teacher("�缮",45,"��22");
		Teacher th2 = new Teacher("���",50,"��33");
		Manager ma1 = new Manager("ȣ��",48,"��44");
		Manager ma2 = new Manager("����",48,"��55");
		st1.printSt();st2.printSt();
		th1.printTh();th2.printTh();
		ma1.printMa();ma2.printMa();
}
}
