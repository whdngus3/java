package chap5;

public class initblk2 {
	int k;
	static {
		System.out.println("Ŭ���� �ʱ�ȭ ��");
		
	}
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��");
		k=7;
	}
	public static void main(String[] args) {
		initblk2 ib1 = new initblk2();
		initblk2 ib2 = new initblk2();
		System.out.println("k = "+ib1.k);
		System.out.println("k = "+ib2.k);
	}
}
	
