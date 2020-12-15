package jojo;

public class Throws {
	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
			int num = (int)(Math.random()*10);
			try {
			cal(num);
		} catch(Exception e) {
			System.out.println("0À¸·Î ¸ø³ª´®");
		}
		}
		
	}

	private static void cal(int num) throws Exception{
		System.out.printf("%d / %d = %d\n",100,num,100/num);
		
	}
}
