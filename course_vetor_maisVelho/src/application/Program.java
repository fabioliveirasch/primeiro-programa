package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];

		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Dados da " + (i + 1) + "ª Pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}

		int maisVelho = idades[0];
		int pos = 0;
		for (int i = 0; i < nomes.length; i++) {
			if (idades[i] > maisVelho) {
				maisVelho = idades[i];
				pos = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nomes[pos]);
	}
}
