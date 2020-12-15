package chap5;

public class PersonEx {
	public static void main(String[] args) {
		Student st1 = new Student("화사",25,"가11");
		Student st2 = new Student("제시",31,"나22");
		Teacher th1 = new Teacher("재석",45,"다22");
		Teacher th2 = new Teacher("명수",50,"라33");
		Manager ma1 = new Manager("호동",48,"마44");
		Manager ma2 = new Manager("수근",48,"바55");
		st1.printSt();st2.printSt();
		th1.printTh();th2.printTh();
		ma1.printMa();ma2.printMa();
}
}
