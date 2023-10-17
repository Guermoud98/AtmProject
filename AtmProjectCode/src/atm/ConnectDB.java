package atm;
import java.sql.*;

public class ConnectDB {
	private static Connection conn;
	//private constructor
	private ConnectDB() {};
	static {
		try {
			String connectionUrl = "jdbc:sqlserver://MARIA-GM:1433;" +
			        "databaseName=atmApp;integratedSecurity=true;" +
			        "encrypt=true;trustServerCertificate=true";
			conn = DriverManager.getConnection(connectionUrl);
			System.out.println("Connectedd");
			 /*Statement stmt = connection.createStatement();
	           String query = "INSERT INTO clients (nom, prenom, cin, cardNumber, password, accountType, accountNumber)"
	            		+ "VALUES ('Wilson', 'Sophia', '8888888888', '1234567890123456', 'secure456', 'Checking', '7654321098765432')";

	            //for a non Query statement
	            int result = stmt.executeUpdate(query);           
	            if (result > 0) {
	            	System.out.println("new column added.");
	            }
	            else {
	            	System.out.println("unable to add a column.");
	            }*/
			
		}
		catch (SQLException e) {
            e.printStackTrace();
        }
	}
	public static Connection getConn() {
		return conn;
	}

}
