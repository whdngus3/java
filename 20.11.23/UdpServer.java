package jojo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpServer {
	public static void main(String[] args) throws IOException {
		byte[] bt = new byte[50];
		DatagramPacket dp = new DatagramPacket(bt,bt.length);
		DatagramSocket ds = new DatagramSocket(5007);
		String msg = "";
		while(true) {
			ds.receive(dp);
			InetAddress addr = dp.getAddress();
			msg = new String(dp.getData(),0,dp.getLength());
			System.out.println(addr + "=>" + msg);
			
		}
	}
}
