package chap5;

public class tv_ex {
	public static void main(String[] args) {
		tv tv1 = new tv("����",false,7);
		tv tv2 = new tv("���",true,15);
		tv tv3 = new tv("�Ķ�",false,11);
		
		
		tv[] tvs= {tv1,tv2,tv3};
		for(tv j:tvs) {
			j.prn();
			
		}
	}
}
