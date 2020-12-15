package first;

public class Do_hyung {
	public static void main(String[] args) {
		String s_num="10";
		int i_num = Integer.parseInt(s_num);
		int i_num2 = Integer.valueOf(s_num);
		
		System.out.println("문자:" + s_num);
		System.out.println("문자:" + i_num);
		System.out.println("문자:" + i_num2);
		
		System.out.println("문자:" + s_num+1);
		System.out.println("숫자:" + i_num+1);
		System.out.println("문자:" + i_num2+1);
	}
}
