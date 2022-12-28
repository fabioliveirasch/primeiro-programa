package curso_programacao;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int out = 0, in = 0;

		for (int i = 1; i <= N; i++) {
			System.out.println("Digite um valor:");

			int X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}

		}
		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

	}

}
