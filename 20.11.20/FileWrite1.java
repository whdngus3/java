package jojo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class FileWrite1 {
	public static void main(String[] args)throws IOException {
		Date date = new Date();
		String str= "파일 생성시간 : "+date+"\n";
		Scanner sc = new Scanner(System.in);
		System.out.println("name");
		String file = sc.nextLine();
		System.out.println("word");
		str+=sc.nextLine();
		FileWriter fw = new FileWriter(file);
		fw.write(str);;
		fw.close();
		sc.close();
		System.out.println("종료");
	}
}
