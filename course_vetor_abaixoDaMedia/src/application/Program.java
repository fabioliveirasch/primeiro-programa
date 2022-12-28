package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vão ter no vetor? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma = soma + vect[i];
		}

		System.out.println();
		double media = soma / vect.length;
		System.out.println("MÉDIA DO VETOR = %.3f%n" + media);

		System.out.println();
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.2f%n", vect[i]);
			}
			sc.close();
		}
	}
}
