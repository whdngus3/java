package chap5;

public class chap6_2 {
	private static chap6_2 instance = new chap6_2();
	private chap6_2() {}//�Ű����� ���� ������
	public static chap6_2 getInstance() {//static Ŭ������. �޼���()��밡��
		return instance;
	}
}
