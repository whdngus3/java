package jojo;


class Exception1 extends Exception {
	Exception1(String msg){
		super(msg);
	}
	
}

public class Myexcept extends Exception{
	public static void main(String[] args) {
		try {
		throw new Exception1("Çæ ¿¹¿Ü");
	} catch(Exception1 e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}
}
}
