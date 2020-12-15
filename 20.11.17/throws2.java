package jojo;

public class throws2 {
	public static void main(String[] args) {
		try{
			m1();
		} catch (Exception e){
			System.out.println("에러처리했다");
		}
	}

	private static void m1() throws Exception{
		m2();
		
	}

	private static void m2() throws Exception {
		throw new Exception();
		
	}
}
