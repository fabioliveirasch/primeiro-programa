package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class CalculoAreaTriangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b,c, p1, area1, x, y, z, p2, area2;

		System.out.println("Digite as medidas dos 3 lados do triângulo A:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		p1 = (a + b + c) / 2;
		area1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 * c));
		
		System.out.println("Digite a medida dos 3 lados do triângulo B:");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();

		p2 = (x + y + z) / 2;
		area2 = Math.sqrt(p2 * (p2 - x) * (p2 - y) * (p2 * z));
		

		double maior = max(area1, area2);
		
		System.out.printf("A área do triângulo p1 é %.2f%n", area1);
		System.out.printf("A área do triângulo p2 é %.2f%n", area2);

		showResult(maior);

		sc.close();

	}

	public static double max(double a, double b) {

		double aux;

		if (a > b) {
			aux = a;
		} else {
			aux = b;
		}
		return aux;
	}

	public static void showResult(double value) {
		System.out.printf("O triângulo com área maior tem %.2f%n", value);
	}

}
