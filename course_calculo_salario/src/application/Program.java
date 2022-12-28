package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.println("Preencha os dados do funcionário");
		System.out.print("Nome: ");
		funcionario.nome = sc.nextLine();
		System.out.println("Salário Bruto: ");
		funcionario.sal_bruto = sc.nextDouble();
		System.out.println("Imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.printf("Funcionario: " + funcionario.nome + ", $ %.2f", funcionario.salarioLiquido());
		System.out.println();
		System.out.println();


		System.out.println("De quanto será o aumento (porcentagem) do salário?");
		double porcentagem = sc.nextDouble();
		funcionario.aumentar_sal(porcentagem);

		System.out.println("Dados atualizados: " + funcionario);
	}
}