package jojo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class SendThread extends Thread {
	Socket client; String nickname;
	public SendThread(Socket client, String nickname) {
		this.client=client; this.nickname=nickname;
	}
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(client.getOutputStream());
			writer.println(nickname);
			writer.flush();
			while (true) {
				String str = reader.readLine();
				if (str.equals("bye")) break;
				writer.println(str);
				writer.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try{ client.close();	}catch (Exception e) {	}
		}
	}
}
