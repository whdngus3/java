package first;
import java.util.Scanner;
public class scanner_ex {

	public static void main(String[] args) {
		boolean run = true;
		int balance =0;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------------");
			System.out.print("����> ");
			
			int menuNum= Integer.parseInt(scanner.nextLine());
					switch (menuNum) {
					case 1:
						System.out.print("���ݾ�> ");;
						balance += Integer.parseInt(scanner.nextLine());
						break;
					case 2:
						System.out.print("��ݾ�> ");;
						balance -= Integer.parseInt(scanner.nextLine());
						break;
					case 3:
						System.out.print("�ܰ�> ");;
						System.out.println(balance);;
						break;
					case 4:
						run= false;
						break;
					}
			System.out.println();
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}

}