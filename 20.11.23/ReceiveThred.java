package jojo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;
public class ReceiveThred extends Thread {
	Socket client;
	public ReceiveThred(Socket client) {
		this.client = client;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
			while(true) {
				// 메세지가 계속 콘솔에 출력
				String str= reader.readLine();
				if (str == null) break; // 메세지가 null이면 종료
				System.out.println(str);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
