package atm;

import java.sql.SQLException;

public class SavingAccount extends Account{
	private float interestFee;
	
	public SavingAccount(float interestFee, String cardNumber) throws SQLException {
		super(cardNumber);
		this.interestFee = interestFee;
	}

	public float getInterestFee() {
		return interestFee;
	}

	public void setInterestFee(float interestFee) {
		this.interestFee = interestFee;
	}

	@Override
	public String toString() {
		return "SavingAccount [interestFee=" + interestFee + "]";
	}
	

}
