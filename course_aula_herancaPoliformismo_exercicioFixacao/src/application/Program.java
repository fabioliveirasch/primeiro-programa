package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();

		List<Contribuinte> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do Contribuinte #" + i + ":");
			System.out.print("Pessoa física ou Pessoa Jurídica (f/j)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			Double rendAnual = sc.nextDouble();
			if (op == 'f') {
				System.out.print("Despesas médicas: ");
				Double despMedic = sc.nextDouble();
				list.add(new Fisica(nome, rendAnual, despMedic));
			} else {
				System.out.print("Quantidade de funcionários: ");
				int qtdeFunc = sc.nextInt();
				list.add(new Juridica(nome, rendAnual, qtdeFunc));
			}
		}
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (Contribuinte cb : list) {
			System.out.println(cb.getNome() + ": $ " + String.format("%.2f", cb.taxa()));
		}

		System.out.println();
		double soma = 0;
		for (Contribuinte cb : list) {
			soma += cb.taxa();
		}

		System.out.println();
		System.out.println("TOTAL DE IMPOSTOS: " + "$ " + String.format("%.2f", soma));

		sc.close();
	}
}
