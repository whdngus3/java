package chap5;

public interface Volume {
	void volumeUp();
	void volumeDown();

}

class Radio implements Volume {
	public void volumeUp() {
		System.out.println("�����������÷�");
	}
	public void volumeDown() {
		System.out.println("�����������ٿ�");
	}
}

class Tv implements Volume {
	public void volumeUp() {
		System.out.println("���������÷�");
	}
	public void volumeDown() {
		System.out.println("���������ٿ�");
	}
}

class Speaker implements Volume {
	public void volumeUp() {
		System.out.println("�����������÷�");
	}
	public void volumeDown() {
		System.out.println("�����������ٿ�");
	}
}