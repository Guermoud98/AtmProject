package atm;

import java.sql.SQLException;
import java.util.*;

public class App {

	public static void main(String[] args) throws SQLException {
		//account1
		Account a =  new Account("2345678901234567");
		a.Login(a.getCardNumber(),"secret456");
		System.out.println("user1: ");
		System.out.println("Your current balance" +a.getBalance());
		System.out.println(a.getAccountNumber());
		System.out.println(a.getAccountType());
		System.out.println(a.getPassword());
		System.out.println(a.getNom());
		//a.withDrawCash(a.getBalance(),a.getCardNumber() ,2);
		//account2
		System.out.println("user2: ");
		Account a2 = new Account("6543210987654321");
		a2.Login(a2.getCardNumber(),"secure456");
		
		//list of accounts : new ArrayList<String>();
		List<Account> accounts = new ArrayList<Account>();
	    accounts.add(a);
	    accounts.add(a2);
	    
	    Client c = new Client(accounts,"6543210987654321");
	    //System.out.println(c.getNom());
	
		a.logout();

	}

}
