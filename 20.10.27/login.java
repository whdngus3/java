package first;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				System.out.print("���̵�: ");
				String name=scanner.nextLine();
				System.out.print("�н�����: ");
				String strPassword = scanner.nextLine();
				int password = Integer.parseInt(strPassword);
				
				System.out.print("���̵�: "+name);
				System.out.println(" �н�����" +password);
				
				String fid="aaaa";
				int fpass=12341234;

				
				if (name.equals(fid)) {
					if (fpass==password) {
						System.out.println("�α��� �Ǿ����ϴ�");
					} else {
						System.out.println("�߸��� ��й�ȣ �Դϴ�.");
					}
				} else {
					System.out.println("���̵� �����ϴ�.");
				}
				scanner.close();
	}
}
