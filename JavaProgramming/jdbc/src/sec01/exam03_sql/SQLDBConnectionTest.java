package sec01.exam03_sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDBConnectionTest {
	//Ŭ������ �ε��� �� �� �� �� ȣ��Ǵ� ����
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:sqlserver://localhost:1433;databaseName=master;";
		String userID = "sa";
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
