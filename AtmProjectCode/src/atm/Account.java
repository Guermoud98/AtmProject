package atm;
import java.sql.*;
import java.util.Arrays;

public class Account {
	//private String dateCreation;
	private float balance;
	private String [] accountType= new String[2];
	private String [] accountNumber = new String[2];
	private String cardNumber;
	private String password;
	private String nom;
	private String prenom;
	private String cin;
	private PreparedStatement p = null;
	private ResultSet rs = null;
	private String query = "SELECT * FROM CLIENT";
	private Connection conn = SingletonConnection.getInstance();
	private int k = 0;
	
	public Account(String cardNumber) throws SQLException {
		p = conn.prepareStatement(query);
		rs = p.executeQuery();
		this.cardNumber = cardNumber;
		while(rs.next()) {
			if(rs.getString(8).equals(cardNumber) && k<2) {
				balance = rs.getFloat(9);
				accountType[k] = rs.getString(7);
				accountNumber[k] = rs.getString(5);
				password = rs.getString(6);
				cardNumber = rs.getString(8);
				nom =  rs.getString(2);
				prenom =  rs.getString(3);
				cin =  rs.getString(4);
				k++;
			}
	
		}
		
	}
	

	


	//login
	public void Login(String cardNumber, String password) {
		try {
			p = conn.prepareStatement(query);
			rs = p.executeQuery();
			while(rs.next()) {
				if(rs.getString(6).equals(password) && rs.getString(8).equals(cardNumber)) {
					System.out.println("Welcome");	
					break;
			       }
		 }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}	
		
	}
	
	//withDrawCash method
	public void withDrawCash(float balanceValue, String cardNumber, float amount) throws SQLException {
		
		/*p = conn.prepareStatement(query);
		rs = p.executeQuery();
		while(rs.next()) {
			if(amount <= balance) {
			//	balance = rs.getFloat(9);
				query = "UPDATE CLIENT SET balance = balance - amount";
			    balance-= amount; //balance of my account object
			    System.out.println("balance =" + balance);
			    break;
			    
			//balance -= amount;
			
		}
		else {
			System.out.println("operation impossible!!");
		}
	  }*/
		
		if(cardNumIsExist(cardNumber) == true && balanceValue >= amount) {
			query = "UPDATE CLIENT SET balance = ? where card_number = ?";
			p = conn.prepareStatement(query);
			balanceValue -= amount;
		    p.setFloat(1, balanceValue);
		    p.setString(2, cardNumber);
		    p.executeUpdate();
		    balance-= amount;
		    //System.out.println(balance);
		    
		}
		else {
			System.out.println("operation impossible!!");
		}
		
			
		
	}
	
	
	/*public float retrieveBalanceDB(String cardNumber) throws SQLException   {
		while(rs.next()) {
			try {
				if(cardNumber.equals(rs.getString(5))) {
					balance = rs.getFloat(9);
					break;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return balance; 
	}*/
	
	public boolean cardNumIsExist(String cardNumber) throws SQLException {
		p = conn.prepareStatement(query);
		rs = p.executeQuery();
		while(rs.next()) {
			if(cardNumber.equals(rs.getString(8))) {
				return true;
			}
		}
		return false;
	}
	
	
	
	public void logout() {
		System.exit(0);
	}
	//affichage
	
	@Override
		public String toString() {
			return "Account [balance=" + balance + ", accountType=" + Arrays.toString(accountType) + ", accountNumber="
					+ Arrays.toString(accountNumber) + ", cardNumber=" + cardNumber + ", password=" + password
					+ ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + "]";
		}


	//getters and setters :
	public float getBalance() {
		return balance;
	}
	




	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String[] getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String[] accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	
  
}
