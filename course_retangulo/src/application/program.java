package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.print("Digite o valor da base do retângulo: ");
		retangulo.base = sc.nextDouble();

		System.out.print("Digite o valor da altura do retângulo: ");
		retangulo.altura = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERÍMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

		sc.close();
	}

}