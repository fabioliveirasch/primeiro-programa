package curso_programacao;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Numerador_Denominador {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (double i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (b == 0) {
				System.out.println("Divisão impossível");
			} else {
				double div = (double) a / b;
				System.out.println(div);
			}
		}
		sc.close();
	}
}
