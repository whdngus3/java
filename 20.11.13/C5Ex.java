package chap5;

class C6 implements C5{
	
	public void m3() {System.out.println("戲學1");}
	public void m2() {System.out.println("戲學2");}
	public void m1() {System.out.println("戲學3");}
	public void m4() {System.out.println("戲學4");}
	public void m5() {System.out.println("戲學5");}
	
	
}

public class C5Ex{
	public static void main(String[] args) {
		C6 c = new C6();
		c.m1();c.m2();c.m3();c.m4();c.m5();
		
	}
}