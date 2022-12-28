package curso_programacao;

import java.util.Scanner;

public class Par_Impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		if (N % 2 == 0) {
			System.out.println("O número digitado é PAR!");
		} else {
			System.out.println("O número digitado é ÍMPAR");
		}
		sc.close();
	}
}
