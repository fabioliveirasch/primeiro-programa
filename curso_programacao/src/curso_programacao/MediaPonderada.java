package curso_programacao;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de testes:");

		int T = sc.nextInt();

		System.out.println("Insira 3 valores para calcular a média ponderada:");

		for (int i = 1; i <= T; i++) {

			System.out.println("Insira 3 valores para calcular a média ponderada:");

			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			double MP = (x * 2.0 + y * 3.0 + z * 5.0) / 10;

			System.out.printf("%.1f%n", MP);

		}
		sc.close();
	}

}