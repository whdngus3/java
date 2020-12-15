package jojo;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class TimeClient {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);		
		System.out.println("������ ip�� �Է��ϼ���");
		String ip = sc.nextLine();
		Socket sock = new Socket(ip, 7000);
		InputStream is = sock.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(is);
		GregorianCalendar gc =
				(GregorianCalendar)ois.readObject();
		System.out.printf("���� %TF %TT",gc,gc);
		is.close(); ois.close(); sock.close(); sc.close(); 
	}
}