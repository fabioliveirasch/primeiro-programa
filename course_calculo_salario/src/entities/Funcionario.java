package entities;

public class Funcionario {

	public String nome;
	public double sal_bruto;
	public double imposto;

	public double salarioLiquido() {
		return sal_bruto - imposto;
	}

	public void aumentar_sal(double porcentagem) {
		sal_bruto += sal_bruto * porcentagem / 100;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", salarioLiquido());
	}

}
