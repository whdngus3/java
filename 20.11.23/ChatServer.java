package jojo;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class ChatServer {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(7001);
			System.out.println("���� �۵� ��....");
			while(true) {
				Socket client = ss.accept(); // client����
				// client ������ �����͸� �޾Ƽ� ó��
				DataInputStream dis = 
					new DataInputStream(client.getInputStream());
				BufferedReader br = // ���پ� ������ �б� ���ؼ�
					new BufferedReader(new InputStreamReader(dis));
				System.out.println(client.getInetAddress()+
						"=>"+br.readLine());
				// ���� ������ client�� ���� ����
				dis.close();	br.close();		client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}
}
