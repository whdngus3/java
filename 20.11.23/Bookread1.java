package jojo;

import java.io.ObjectInputStream;

public class Bookread1 {
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream()new FileInputStream("book.txt");
			
		}catch(Exception e) {
			System.out.println("���α׷� ����");
			
		} finally { ois.close();
			
		}
	}
}
