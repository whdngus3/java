package chap5;

public class outer {
	private int width;
	private int height;
	public outer(int width, int height) {
		this.width = width; this.height = height;
	}
	public Inner getInstance() {
		return new Inner();
		
	}
	class Inner {//����Ŭ����
		private float rate = 0.5f;
		public float volume() {
			return rate*height*width;
		}
	}
}
