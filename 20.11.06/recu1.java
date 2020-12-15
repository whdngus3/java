package jojo1;

public class recu1 {
	public static void main(String[] args) {
		int result = fat(5);
		System.out.println(result);
	}
	static int fat(int num) {
		if(num ==1) return 1 ;
		else return(num*fat(num-1));
	}
}
