package entities;

public class SavingsAccount extends Account {

	private Double intestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double intestRate) {
		super(number, holder, balance);
		this.intestRate = intestRate;
	}

	public Double getIntestRate() {
		return intestRate;
	}

	public void setIntestRate(Double intestRate) {
		this.intestRate = intestRate;
	}
	
	public void updateBalance() {
		balance += balance * intestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount ;
	}

}
