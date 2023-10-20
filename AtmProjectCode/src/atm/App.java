package atm;

import java.sql.SQLException;

public class App {

	public static void main(String[] args) throws SQLException {
		Account a =  new Account("7654321098765432");
		a.Login(a.getCardNumber(),"secure456");
		//a.withDrawCash(a.getBalance(),a.getCardNumber() ,2);
		a.logout();
		a.checkBankbalance();
		
		//System.out.println("get" +a.getBalance());
		//System.out.println(a.getAccountNumber());
		//System.out.println(a.getAccountType());
		//System.out.println(a.getPassword());
		

	}

}
