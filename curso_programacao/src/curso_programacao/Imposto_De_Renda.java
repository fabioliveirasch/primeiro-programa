package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Imposto_De_Renda {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double Sal, Imp;

		Sal = sc.nextDouble();

		if ((Sal >= 0) && (Sal <= 2000)) {
			System.out.println("Isento de imposto!");
		} else if ((Sal >= 2000.01) && (Sal <= 3000)) {
			Imp = Sal * 0.08;
			System.out.printf("Valor do imposto à ser pago: %.2f%n", Imp);
		} else if ((Sal >= 3000.01) && (Sal <= 4500)) {
			Imp = ((Sal - 3000) * 0.18) + 80;
			System.out.printf("Valor do imposto à ser pago: %.2f%n", Imp);
		} else if (Sal > 4500) {
			Imp = ((Sal - 4500) * 0.28) + 350;
			System.out.printf("Valor do imposto à ser pago: %.2f%n", Imp);
		}
	}

}