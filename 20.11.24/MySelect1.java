package oracle;


import java.sql.*;
import java.util.Scanner;
public class MySelect1 {
	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȸ�� �μ��ڵ�� ?");
		int deptno = sc.nextInt();
		String sql = "select * from dept where deptno="+deptno;
		try{Class.forName(driver);
			conn=DriverManager.getConnection(url,"root", "1234");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				String dname = rs.getString(2); // ("dname"); 
				String loc = rs.getString(3);
				System.out.println("�μ��ڵ� : "+deptno);
				System.out.println("�μ��� : "+dname);
				System.out.println("�ٹ��� : "+loc);
			}else System.out.println("���� �μ� �Դϴ�");
			rs.close(); stmt.close(); conn.close();
		}catch (Exception e) { System.out.println(e.getMessage()); }
		sc.close();
	}
}