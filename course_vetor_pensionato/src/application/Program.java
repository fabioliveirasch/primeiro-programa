package application;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[10];

		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Aluguel " + (i + 1));
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluguel(nome, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}

		}

		sc.close();

	}

}
