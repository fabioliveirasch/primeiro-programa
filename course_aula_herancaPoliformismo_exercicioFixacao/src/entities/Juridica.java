package entities;

public class Juridica extends Contribuinte {

	private int qtdeFunc;

	public Juridica() {
		super();
	}

	public Juridica(String nome, Double rendaAnual, int qtdeFunc) {
		super(nome, rendaAnual);
		this.qtdeFunc = qtdeFunc;
	}

	public int getQtdeFunc() {
		return qtdeFunc;
	}

	public void setQtdeFunc(int qtdeFunc) {
		this.qtdeFunc = qtdeFunc;
	}

	@Override
	public double taxa() {
		// Outra forma de fazer o if
		// double taxa = (getQtdeFunc() > 10) ? getRendaAnual() * 0.14 : getRendaAnual()
		// * 0.16;

		if (qtdeFunc > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}
}
