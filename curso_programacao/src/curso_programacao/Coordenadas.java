package curso_programacao;

import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a coordenada X:");
		int x = sc.nextInt();

		System.out.println("Digite a coordenada Y:");
		int y = sc.nextInt();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro");

			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");

			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");

			} else {
				System.out.println("Quarto");
			}
			System.out.println("Digite a coordenada X:");
			x = sc.nextInt();

			System.out.println("Digite a coordenada Y:");
			y = sc.nextInt();
			sc.close();
		}
	}
}
