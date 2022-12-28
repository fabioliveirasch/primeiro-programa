package curso_programacao;

import java.util.Scanner;

public class Multiplicidade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A, B;

		A = sc.nextInt();
		B = sc.nextInt();

		if ((A % B == 0) || (B % A == 0)) {
			System.out.println("São Múltiplos!");
		} else {
			System.out.println("Não são Múltiplos!");
		}
		sc.close();
	}
}