package first;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
				System.out.print("아이디: ");
				String name=scanner.nextLine();
				System.out.print("패스워드: ");
				String strPassword = scanner.nextLine();
				int password = Integer.parseInt(strPassword);
				
				System.out.print("아이디: "+name);
				System.out.println(" 패스워드" +password);
				
				String fid="aaaa";
				int fpass=12341234;

				
				if (name.equals(fid)) {
					if (fpass==password) {
						System.out.println("로그인 되었습니다");
					} else {
						System.out.println("잘못된 비밀번호 입니다.");
					}
				} else {
					System.out.println("아이디가 없습니다.");
				}
				scanner.close();
	}
}
