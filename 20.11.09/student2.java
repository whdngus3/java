package chap5;

public class student2 {
	String name; int kor, eng, math;
	
	student2(){
		this("����");
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
		System.out.println("�̸�: "+name);
		System.out.println("����: "+kor);
		System.out.println("����: "+eng);
		System.out.println("����: "+math);
		
	}
	
	public static void main(String[] args) {
		student2 st = new student2();
		st.prn();
	}
}
