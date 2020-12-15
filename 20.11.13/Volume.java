package chap5;

public interface Volume {
	void volumeUp();
	void volumeDown();

}

class Radio implements Volume {
	public void volumeUp() {
		System.out.println("¤©¤§¤·º¼·ý¿Ã·Á");
	}
	public void volumeDown() {
		System.out.println("¤©¤§¤·º¼·ýÁÙ¿©");
	}
}

class Tv implements Volume {
	public void volumeUp() {
		System.out.println("¤¼¤²º¼·ý¿Ã·Á");
	}
	public void volumeDown() {
		System.out.println("¤¼¤²º¼·ýÁÙ¿©");
	}
}

class Speaker implements Volume {
	public void volumeUp() {
		System.out.println("¤µ¤½¤»º¼·ý¿Ã·Á");
	}
	public void volumeDown() {
		System.out.println("¤µ¤½¤»º¼·ýÁÙ¿©");
	}
}