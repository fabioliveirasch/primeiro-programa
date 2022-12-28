package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Raio_Circulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double raio, area;
		final double pi = 3.14159;

		raio = sc.nextDouble();
		area = pi * Math.pow(raio, 2);

		System.out.printf("O valor do raio do círculo é %.4f%n", area);

		sc.close();
	}
}
