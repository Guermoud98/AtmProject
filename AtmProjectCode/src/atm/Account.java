package atm;
import java.sql.*;

public class Account {
	private String dateCreation;
	private int balance;
	private String accountType;
	private String accountNumber;
	private String password;
	private PreparedStatement p = null;
	private ResultSet rs = null;
	private String query = "SELECT * FROM CLIENTS";
	private Connection conn = ConnectDB.getConn();
	
	public Account(String accountNumber, String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	public void Login() {
		try {
			p = conn.prepareStatement(query);
			rs = p.executeQuery();
			while(rs.next()) {
				if((rs.getString(4)).equals(accountNumber) && (rs.getString(5).equals(password))) {
					System.out.println("Welcome");	
			}
		 }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
	}
  
}
