package oracle;

import java.util.Scanner;
import java.sql.*;
public class OraSelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �μ��ڵ�� ?");
		int deptno = sc.nextInt();
		String sql = "select * from dept where deptno="+deptno;
		Connection conn = null; // Database�� ����;
		try{Class.forName(driver); // driver load
			conn=DriverManager.getConnection(url,"scott","tiger");
			Statement stmt = conn.createStatement(); // sql����� �غ�
			// sql�� �����ؼ� ���� ����� rs�� ����
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) { // rs���� ù��° �����͸� �о��
				System.out.println("�μ��ڵ� : "+rs.getInt("deptno"));
				System.out.println("�μ��� : "+rs.getString("dname"));
				System.out.println("�ٹ��� : "+rs.getString("loc"));
			}else System.out.println("���� �μ��Դϴ�");
		}catch (Exception e) {		conn.close();		}
		sc.close();
	}
}