package jojo;

import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(9001);
			while(true) {
				Socket client= ss.accept();
				Thread th = new PerClientThread(client);
				th.start();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}
}
