package atm;

import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		//ConnectDB.getConn();
		//Account a = new Account("7654321098765432","secure456");
		
		//System.out.println(a.retrieveBalanceDB("7654321098765432"));
		//a.withDrawCash(a.getBalance(), 5.0f);
		Account a =  new Account("7654321098765432");
		a.Login(a.getCardNumber(),"secure456");
		a.withDrawCash(a.getBalance(), 2);
		System.out.println(a.getBalance());
		//System.out.println(a.getAccountNumber());
		//System.out.println(a.getAccountType());
		//System.out.println(a.getPassword());
		

	}

}
