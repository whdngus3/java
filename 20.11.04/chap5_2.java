package chap5;

public class chap5_2 {
	public static void main(String[] args) {
		//Ŭ������ ��ü��
		chap5_1 myCar = new chap5_1();//����� ������ ������
		chap5_1 yourCar;//��ü ����
		yourCar = new chap5_1();//��ü ����
		myCar.color="����";
		chap5_1 car1= new chap5_1();
		car1.color="�ʷ�";
		myCar.displacement = 1500;
		yourCar.color="���";
		yourCar.displacement=1500;
		myCar.print();
		yourCar.print();
		car1.print();
	}
	
}
