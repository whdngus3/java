package jojo;

import java.util.Random;

public class Random1 {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println(ran.nextInt(101));
		System.out.println(ran.nextInt(100)+1);
		System.out.println(ran.nextInt());
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextLong());
		System.out.println(ran.nextBoolean());
	}
}
