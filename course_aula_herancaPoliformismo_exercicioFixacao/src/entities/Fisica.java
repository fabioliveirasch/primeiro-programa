package entities;

public class Fisica extends Contribuinte {

	private Double despSaude;

	public Fisica() {
		super();
	}

	public Fisica(String nome, Double rendaAnual, Double despSaude) {
		super(nome, rendaAnual);
		this.despSaude = despSaude;
	}

	public Double getDespSaude() {
		return despSaude;
	}

	public void setDespSaude(Double despSaude) {
		this.despSaude = despSaude;
	}

	@Override
	public double taxa() {
		
		//Outra forma de fazer o if (Expressão condicional ternária)
		//double taxa = (getRendaAnual() < 20000.00) ? getRendaAnual() * 0.15 - (getDespSaude() * 0.5):getRendaAnual() * 0.25 - (getDespSaude() * 0.5);
		
		double taxa = 0;
		if (getRendaAnual() < 20000.00) {
			taxa = getRendaAnual() * 0.15 - (getDespSaude() * 0.5);
		} else {
			taxa = getRendaAnual() * 0.25 - (getDespSaude() * 0.5);
		}
		if (taxa < 0) {
			taxa = 0;
		}
		return taxa;
	}
}
