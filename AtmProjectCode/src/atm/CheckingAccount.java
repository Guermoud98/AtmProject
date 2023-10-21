package atm;

import java.sql.SQLException;

public class CheckingAccount extends Account {
	private float overDratFee;

	public CheckingAccount(String cardNumber, float overDratFee) throws SQLException {
		super(cardNumber);
		this.overDratFee = overDratFee;
	}

	public float getOverDratFee() {
		return overDratFee;
	}

	public void setOverDratFee(float overDratFee) {
		this.overDratFee = overDratFee;
	}

	@Override
	public String toString() {
		return "CheckingAccount [overDratFee=" + overDratFee + "]";
	}
	
	

}
