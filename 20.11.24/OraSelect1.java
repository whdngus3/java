package oracle;

import java.util.Scanner;
import java.sql.*;
public class OraSelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.println("보고 싶은 부서코드는 ?");
		int deptno = sc.nextInt();
		String sql = "select * from dept where deptno="+deptno;
		Connection conn = null; // Database와 연결;
		try{Class.forName(driver); // driver load
			conn=DriverManager.getConnection(url,"scott","tiger");
			Statement stmt = conn.createStatement(); // sql사용할 준비
			// sql을 실행해서 얻은 결과를 rs에 저장
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) { // rs에서 첫번째 데이터를 읽어라
				System.out.println("부서코드 : "+rs.getInt("deptno"));
				System.out.println("부서명 : "+rs.getString("dname"));
				System.out.println("근무지 : "+rs.getString("loc"));
			}else System.out.println("없는 부서입니다");
		}catch (Exception e) {		conn.close();		}
		sc.close();
	}
}