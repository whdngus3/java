package chap5;

public class final1 {
	//final �� ���� �������� ����� �ǹ�
	//final �� �������� ���� �빮�ڷ� ���� ���� ����
	int max=100;
	final int min = 200;
	public static void main(String[] args) {
		final1 f1 = new final1();
		System.out.println("max = "+f1.max);
		System.out.println("min = "+f1.min);
		f1.max = 120;
		
	}
	
}
