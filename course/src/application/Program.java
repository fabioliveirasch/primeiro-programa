package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite as medidas dos 3 lados do triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite a medida dos 3 lados do triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("A área do triângulo X é %.2f%n", areaX);
		System.out.printf("A área do triângulo Y é %.2f%n", areaY);

		if (areaX > areaY) {
			System.out.println("A maior área é do triângulo X");
		} else {
			System.out.println("A maior área é do triângulo Y");
		}

		sc.close();

	}

}
