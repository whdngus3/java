package chap5;

public class VolumeEx {
	public static void main(String[] args) {
		Volume[] vols = new Volume[3];
		vols[0] = new Radio();
		vols[1] = new Tv();
		vols[2] = new Speaker();
		
		for(Volume v:vols) {
			if (v instanceof Tv) {
				((Tv)v).volumeUp();
				continue;
			}
			v.volumeDown();
			
			
			
		}
	}
}
