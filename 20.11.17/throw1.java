package jojo;

public class throw1 {
	public static void main(String[] args) {
		try{method();}
		catch(Exception e) {
			System.out.println("내가처리했다");
		}
	}
	private static void method() throws Exception{
			throw new Exception();
				
	}
}
