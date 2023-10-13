package atm;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class Connect {
	 // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
    	
        String connectionUrl =
        		"jdbc:sqlserver://MARIA-GM:1433;" +
        		        "databaseName=atmApp;integratedSecurity=true;" +
        		        "encrypt=true;trustServerCertificate=true";
   
        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
            System.out.println("cnx a ete bien etablie");
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
cc







   
