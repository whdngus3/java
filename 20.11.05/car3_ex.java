package chap5;

public class car3_ex {
	public static void main(String[] args) {
		car3 c1 = new car3();
		c1.color="³ë¶û";c1.kind="¸»µÎÅ¸";c1.displacement=100;
		
		car3 c2 = new car3("»¡°­");
		
		c2.kind="BMW"; c2.displacement=200;
		
		car3 c3 = new car3("»¡°­","¼Ò³ªÅ¸");
		c3.displacement=300;
		
		c1.disp();
		c2.disp();
		c3.disp();
		
	}
}
