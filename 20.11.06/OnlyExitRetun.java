package jojo1;

public class OnlyExitRetun {
	public static void main(String[] args) {
		divide(4,2);
		divide(6,2);
		divide(9,0);
	}

	public static void divide(int i, int j) {
		if(j==0) {
			System.out.println("0���δ� ���� �� ����");
			return;	
		} 
		System.out.println(i/j);
		
		
	}
}
