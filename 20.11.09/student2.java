package chap5;

public class student2 {
	String name; int kor, eng, math;
	
	student2(){
		this("우현");
	}
	
	student2(String name){
		this(name,70);
		this.name=name;
		
	}
	student2(String name,int kor){
		this.eng=40;
		this.math=60;

		
	}
	void prn() {
		System.out.println("이름: "+name);
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		
	}
	
	public static void main(String[] args) {
		student2 st = new student2();
		st.prn();
	}
}
