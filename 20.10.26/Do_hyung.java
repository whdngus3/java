package first;

public class Do_hyung {
	public static void main(String[] args) {
		String s_num="10";
		int i_num = Integer.parseInt(s_num);
		int i_num2 = Integer.valueOf(s_num);
		
		System.out.println("����:" + s_num);
		System.out.println("����:" + i_num);
		System.out.println("����:" + i_num2);
		
		System.out.println("����:" + s_num+1);
		System.out.println("����:" + i_num+1);
		System.out.println("����:" + i_num2+1);
	}
}
