package oracle;

import java.sql.*;
public class OraSelect2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String sql = "select * from dept order by deptno";
		try {
			Class.forName(driver);
			Connection conn=
				DriverManager.getConnection(url, "scott","tiger");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("부서코드\t부서명\t\t근무지");
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");  // "deptno"
				if (rs.getString(2).length() > 7)
					System.out.print(rs.getString(2)+"\t");
				else System.out.print(rs.getString(2)+"\t\t");
				System.out.println(rs.getString(3));
			}
			rs.close(); stmt.close(); conn.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}