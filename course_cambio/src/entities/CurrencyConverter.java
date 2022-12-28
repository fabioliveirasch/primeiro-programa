package entities;

public class CurrencyConverter {
	
	public double vlrUnitDol;
	public double qtdeDolar;
	
	public double total() {
		return ((vlrUnitDol * qtdeDolar) * (1.06));
	}
	
}
