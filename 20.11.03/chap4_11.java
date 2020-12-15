package jojo1;


public class chap4_11 {
	public static void main(String[] args) {
	
		
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		
		System.out.println("---------------");			
		
		for(String arg:args) {
			System.out.println(arg);
		}

	}
}
