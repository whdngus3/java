package chap5;

class G1{
	void m1(G3 g) {g.b1();}
}
class G2{
	void b1() {System.out.println("대박");
	
	}
}

class G3{
	void b1() {System.out.println("쪽박");
}
}	

	
public class Inter1 {
	public static void main(String[] args) {
		G2 g2 = new G2();
		G1 g1 = new G1();
		G3 g3 = new G3();
		g1.m1(g3);
	}
}
