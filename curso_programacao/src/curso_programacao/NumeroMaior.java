package curso_programacao;

import java.util.Scanner;

public class NumeroMaior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor digite 3 números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("É óbvio que o maior número é " + a);
		} else if (b > c) {
			System.out.println("É óbvio que o maior número é " + b);
		} else {
			System.out.println("É óbvio que o maior número é " + c);
		}
		sc.close();
	}
}
