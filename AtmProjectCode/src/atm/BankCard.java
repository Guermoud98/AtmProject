package atm;

public class BankCard {
	private String cardNumber;
	public BankCard(String cardNumber) {
			this.cardNumber = cardNumber;
		}
	public String getCardNumber () {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber =  cardNumber;
	}
}


