package chap5;

//�߻�޼���: ��� �޼��尡 ����ο� ����,abstract�� ����
//��� ��������� final������
public interface A1 {
	int a = 10;
	abstract void prn();
	void disp();
}


//interface�� ����Ҷ��� implements
class A2 implements A1{
	public void prn() {
		System.out.println("A= "+A1.a);
		System.out.println("��ȣ");
	}
	public void disp() {
		System.out.println("�������ƿ�");
	}
	
}