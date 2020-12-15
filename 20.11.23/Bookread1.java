package jojo;

import java.io.ObjectInputStream;

public class Bookread1 {
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream()new FileInputStream("book.txt");
			
		}catch(Exception e) {
			System.out.println("프로그램 종료");
			
		} finally { ois.close();
			
		}
	}
}
