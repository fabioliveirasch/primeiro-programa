package entities;

public class Aluno {

	public String nome;
	public double n1;
	public double n2;
	public double n3;

	public double notaFinal() {
		return n1 + n2 + n3;
	}

	public double pontosFaltantes() {
		if (notaFinal() < 60.00) {
			return 60.00 - notaFinal();
		} else {
			return 0.00;
		}
	}
}
