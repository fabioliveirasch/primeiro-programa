package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		double[] alturas = new double[n];
		char[] generos = new char[n];

		for (int i = 0; i < alturas.length; i++) {
			System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
			alturas[i] = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
			sc.nextLine();
			generos[i] = sc.next().charAt(0);
		}

		double menorAltura = alturas[0];
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
		}
		System.out.println("Menor altura = " + menorAltura);

		double maiorAltura = alturas[0];
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		System.out.println("Maior Altura = " + maiorAltura);

		double media = 0, soma = 0;
		int hom = 0, mul = 0;
		for (int i = 0; i < alturas.length; i++) {
			if (generos[i] == 'F') {
				soma = soma + alturas[i];
				mul++;
			} else {
				hom++;
			}
		}
		media = soma / mul;
		System.out.printf("Média das alturas das mulheres = %.2f%n", media);
		System.out.println("Número de homens = " + hom);
		sc.close();
	}
}
