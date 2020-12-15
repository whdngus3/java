package jojo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferRe1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("name");
		String name = br.readLine();
		System.out.println("address");
		String addr = br.readLine();
		System.out.println(name+addr);
		
		
	}
}
