package atm;

public class authentification {
	private String cardNumber;
	private String password;
	
	public authentification(String cardNumber, String password) {
		this.cardNumber = cardNumber;
		this.password = password;
	}
	public authentification() {
		
	}
	//getter
	public String getCardNumber() {
		return cardNumber;
	}
	//setter
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPasword() {
		return password;
	}
	//setter
	public void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return "cardNumber: " + cardNumber + "\n password: " + password;
	}
}
