package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Double valor;

		System.out.println("Digite um valor qualquer: ");

		valor = sc.nextDouble();

		if ((valor > 0) && (valor <= 25)) {
			System.out.println("O número digitado está dentro do intervalo [0-25]");
		} else if ((valor > 25) && (valor <= 50)) {
			System.out.println("O número digitado está dentro do intervalo [25-50]");
		} else if ((valor > 50) && (valor <= 75)) {
			System.out.println("O número digitado está dentro do intervalo [50-75]");
		} else if ((valor > 75) && (valor <= 100)) {
			System.out.println("O número digitado está dentro do intervalo [75-100]");
		} else {
			System.out.println("O número digitado está fora de intervalo!");
		}
		sc.close();

	}

}
