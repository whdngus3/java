package oracle;
import java.sql.*;
public class MyConn1 {
	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"root","1234");
			System.out.println("���� ���� ����");
			conn.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
