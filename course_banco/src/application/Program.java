package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta; // variável do tipo Conta declarada fora do "if" para ser enxergada em outros
						// escopos

		System.out.println("************************************************");
		System.out.println("*****************Banco Familiar*****************");
		System.out.println("************************************************");
		System.out.println();

		System.out.println("**************FORMULÁRIO DE CADASTRO************");
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.print("Digite o nome do Titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Depósito inicial? (S/N): ");
		char resposta = sc.next().charAt(0); // Retornar a letra da resposta que está na posição "0"
		if (resposta == 's') {
			System.out.print("Digite o valor do depósito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial); // instanciar a minha conta com o contrutor com 3
																// argumentos
		} else {
			conta = new Conta(numero, nome); // instanciar a minha conta com o construtor com 2 argumentos
		}

		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.print("Digite o valor a ser depositado: ");
		double valorDepositado = sc.nextDouble();
		conta.deposito(valorDepositado);
		System.out.println("Atualização de saldo da conta: ");
		System.out.println(conta); // imprimir novamente o objeto "conta"

		System.out.println();
		System.out.print("Digite o valor a ser sacado: ");
		double valorSacado = sc.nextDouble();
		conta.saque(valorSacado);
		System.out.println("Atualização de saldo da conta: ");
		System.out.println(conta); // imprimir novamente o objeto "conta"

		sc.close();
	}
}
