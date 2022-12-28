package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaWhile_Contagem {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor qualquer:");

		int x = sc.nextInt();

		int soma = 0;
		while (x != 0) {
			System.out.println("Digite um valor qualquer:");
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println(soma);
		sc.close();
	}

}
