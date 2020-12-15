package oracle;

import java.sql.*;

public class OraConn {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("complete");
			conn.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
