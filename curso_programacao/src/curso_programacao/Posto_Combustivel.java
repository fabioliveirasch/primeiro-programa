package curso_programacao;

import java.util.Scanner;

public class Posto_Combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do combustível abastecido:");

		int A = 0, G = 0, D = 0;

		int tipo = sc.nextInt();

		while (tipo < 4) {
			if (tipo == 1) {
				A += 1;
			} else if (tipo == 2) {
				G += 1;
			} else if (tipo == 3) {
				D += 1;
			}

			tipo = sc.nextInt();

		}

		System.out.println("Muito Obrigado!");
		System.out.println("Álcool :" + A);
		System.out.println("Gasolina: " + G);
		System.out.println("Diesel: " + D);

		sc.close();
	}

}
