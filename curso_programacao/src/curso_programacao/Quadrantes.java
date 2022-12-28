package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Quadrantes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Double x, y;
		System.out.println("Digite o valor do X:");
		x = sc.nextDouble();
		System.out.println("Digite o valor do Y");
		y = sc.nextDouble();

		if ((x > 0) && (y > 0)) {
			System.out.println("Número pertencente ao quadrante Q1");
		} else if ((x < 0) && (y > 0)) {
			System.out.println("Número pertencente ao quadrante Q2");
		} else if ((x > 0) && (y < 0)) {
			System.out.println("Número pertencente ao quadrante Q4");
		} else if ((x < 0) && (y < 0)) {
			System.out.println("Número pertencente ao quadrante Q3");
		} else if ((x == 0) && (y == 0)) {
			System.out.println("Origem");
		}
		sc.close();
	}
}
