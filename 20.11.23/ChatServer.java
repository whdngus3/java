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
			System.out.println("서버 작동 중....");
			while(true) {
				Socket client = ss.accept(); // client연결
				// client 보내는 데이터를 받아서 처리
				DataInputStream dis = 
					new DataInputStream(client.getInputStream());
				BufferedReader br = // 한줄씩 데이터 읽기 위해서
					new BufferedReader(new InputStreamReader(dis));
				System.out.println(client.getInetAddress()+
						"=>"+br.readLine());
				// 지금 접속한 client만 연결 종료
				dis.close();	br.close();		client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}
}
