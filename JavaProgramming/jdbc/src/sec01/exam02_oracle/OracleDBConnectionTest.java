package sec01.exam02_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnectionTest {
	//Ŭ������ �޸𸮷� �ε��� �� �ڵ����� ����ȴ�.( �� �� �� ȣ��Ǵ� ����)
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userID = "sedo";
		String userPass = "SEDO123";

		Connection con = null;

		try {
			con = DriverManager.getConnection(jdbcUrl, userID, userPass);
			con.setAutoCommit(false);
			System.out.println("connection success");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
