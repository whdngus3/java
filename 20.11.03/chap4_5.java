package jojo1;

public class chap4_5 {
	public static void main(String[] args) {
		int i=1;
		outer: for (int k=1;k<=9;k++) {
			for(int j =1; j<=9;j++) {
				System.out.println("�� �ݺ�");
				i++;
				if (i>3) continue outer;
				System.out.println("�� �ȵǳ�");
			}
			System.out.println("�� �ٱ�");
		}	
	}
}
