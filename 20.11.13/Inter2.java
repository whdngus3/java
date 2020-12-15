package chap5;

interface I{void b1();}


class H1{
	void m1(I h) {
		h.b1();
	}
}
class H2 implements I{
	public void b1() {System.out.println("대박");
	
	}
}

class H3 implements I{
	public void b1() {System.out.println("쪽박");
}
}	

	
public class Inter2 {
	public static void main(String[] args) {
		H2 h2 = new H2();
		H1 h1 = new H1();
		H3 h3 = new H3();
		h1.m1(h3);
	}
}
