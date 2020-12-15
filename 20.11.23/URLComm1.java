package jojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
public class URLComm1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		System.out.println("url�� �Է��ϼ���");
		String addr = sc.nextLine();
		try {
			URL url = new URL(addr); // ���ͳ� �ּ�			
			URLConnection uc = url.openConnection(); // �� �ּҿ� ����
			InputStream is = uc.getInputStream(); // ����� ������ ��������
			// ���ͳ� �ּҿ� �ش��ϴ� ������ �б�
			br = new BufferedReader(
				new InputStreamReader(is, "utf-8"));
			String str = null;
			// �����͸� ���پ� �о ���, ���̻� �����Ͱ� ������ ����
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {		br.close();		}
		sc.close(); 
		System.out.println("���α׷� ����");
	}
}