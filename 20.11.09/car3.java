package chap5;


public class car3 {
	String color; int displacement;
	String kind;
	car3() {
		this("����");//������car3("����"); ���� Ŭ������ �ٸ� ������ ȣ��
		System.out.println("no megae");
	}
	car3(String color){
		//�������� ù°�ٿ� this(...)�� �־���Ѵ�
		this(color,1500);
		this.color=color;
		System.out.println("1 megae "+color);
	}
	car3(String color,int displacement){
		
		this.color=color;
		this.displacement=displacement;
		System.out.println("2 megae"+color+","+displacement);
	}
	
	void prn() {
		System.out.println("��: "+color);
		System.out.println("��ⷮ: "+displacement);
		System.out.println("����: "+kind);
	}
	public static void main(String[] args) {
		car3 car= new car3("��ȫ",1300);
		car.kind="BMW";
	}

	
}

