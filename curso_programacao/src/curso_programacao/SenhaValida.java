package curso_programacao;

import java.util.Scanner;

public class SenhaValida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor digite a senha com 4 dígitos:");

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}
		System.out.println("Acesso permitido!");
		sc.close();

	}

}
