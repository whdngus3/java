package jojo;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.GregorianCalendar;

public class TimeServer {
	public static void main(String[] args) throws IOException{
		ServerSocket ss = new ServerSocket(7000);
		try {
			Socket client = ss.accept();
			OutputStream os = client.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(new GregorianCalendar());
			oos.flush();
			os.close();oos.close();client.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		ss.close();
	}
}
