package jojo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UdpClient {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("ip");
		String ip = sc.nextLine();
		System.out.println("message:");
		String msg = sc.nextLine();
		DatagramSocket ds = new DatagramSocket();
		InetAddress addr = InetAddress.getByName(ip);
		byte[] bt = msg.getBytes();
		DatagramPacket dp = 
			new DatagramPacket(bt, bt.length,addr,5007);
		ds.send(dp);
		System.out.println("complete");
		sc.close();
	}
}
