package jojo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class ChatClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ip");
		String ip = sc.nextLine();
		System.out.println("������ �޼���");
		String msg = sc.nextLine();
		Socket client = new Socket(ip, 7001);
		OutputStream os = client.getOutputStream();
		BufferedWriter bw = 
			new BufferedWriter(new OutputStreamWriter(os));
		bw.write(msg);
		bw.flush();
		os.close(); bw.close(); client.close(); sc.close();
		System.out.println("�޼��� ���� �Ϸ�");
	}
}