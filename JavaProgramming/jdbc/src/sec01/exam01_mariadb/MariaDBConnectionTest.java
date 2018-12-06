package sec01.exam01_mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnectionTest {
	//클래스가 로딩될 때 단 한 번 호출되는 영역
	static {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/mysql";
		String userID = "root";
		String userPass = "Java2011";
		Connection con = null;

		try {
			con = DriverManager.getConnection(jdbcUrl, userID, userPass);
			System.out.println("connection success");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
