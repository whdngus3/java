package chap5;

public class initblk1 {
	int[] k=new int[5];
	static int[] a = new int[6];
	//��ü�� ������ �� ����
	{for(int i=0;i<k.length;i++) {
		k[i]= (int)(Math.random()*20)+1;
	}}
	
	//Ŭ���� �ε��ϸ� �ٷν���
	static {for(int i=0;i<a.length;i++) {
		a[i]= (int)(Math.random()*20)+1;
	}}
	
	
	
	public static void main(String[] args) {
		initblk1 ib = new initblk1();
		for(int i=0; i<ib.k.length; i++) {
			System.out.println(ib.k[i]);
		}
		for(int i=0; i<ib.a.length; i++) {
			System.out.println(ib.a[i]);
		}
		
	}
}
