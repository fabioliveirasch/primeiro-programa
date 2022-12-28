package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i2 = 0;
		double menor16 = 0;

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		Dados[] vect = new Dados[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i+1) + "ª Pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Dados(nome, idade, altura);
		}
		System.out.println();
		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			soma += vect[i].getAltura();
		}

		System.out.printf("Altura média: %.2f%n", soma / vect.length);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				i2 += 1;
			}
		}
		
		double percent = i2 * 100 / vect.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}

		sc.close();
	}

}
