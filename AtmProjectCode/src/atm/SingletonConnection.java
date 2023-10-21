package atm;
import java.sql.*;

public class SingletonConnection {
	private static Connection conn;
	private SingletonConnection() {};
	public static Connection getInstance() throws SQLException {
		if(conn == null) {
			String connectionUrl = "jdbc:sqlserver://MARIA-GM:1433;" +
        "databaseName=atmApp;integratedSecurity=true;" +
        "encrypt=true;trustServerCertificate=true";
			conn = DriverManager.getConnection(connectionUrl);
			System.out.println("Connecteddmimi");
			
		}
		return conn;
	}

}
