package chap5;

public interface C1 {
	void m1();

}
interface C2 extends C1{
	void m2();
	
}

interface C3 extends C2{
	void m3();
}
interface C4 {
	void m4();
}


interface C5 extends C3,C4{
	
}