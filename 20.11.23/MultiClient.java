package jojo;

import java.net.Socket;
import java.util.Scanner;
public class MultiClient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("연결할 ip");
		String ip = sc.nextLine();
		System.out.println("사용할 별명");
		String nickname = sc.nextLine();
		try {
			Socket client = new Socket(ip,9001);
			// 보내는 thread
			Thread send = new SendThread(client, nickname);
			// 받는 thread
			Thread receive = new ReceiveThred(client);
			send.start();
			receive.start();
		}catch (Exception e) {
			e.getMessage();
		}
		sc.close();
	}
}