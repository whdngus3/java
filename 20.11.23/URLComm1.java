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
		System.out.println("url을 입력하세요");
		String addr = sc.nextLine();
		try {
			URL url = new URL(addr); // 인터넷 주소			
			URLConnection uc = url.openConnection(); // 그 주소에 연결
			InputStream is = uc.getInputStream(); // 연결된 정보를 가져오기
			// 인터넷 주소에 해당하는 데이터 읽기
			br = new BufferedReader(
				new InputStreamReader(is, "utf-8"));
			String str = null;
			// 데이터를 한줄씩 읽어서 출력, 더이상 데이터가 없으면 종료
			while((str=br.readLine()) != null) {
				System.out.println(str);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {		br.close();		}
		sc.close(); 
		System.out.println("프로그램 종료");
	}
}