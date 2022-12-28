import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		// int y = 32;
		// double x = 10.35784;
		// System.out.println(x);
		// System.out.printf("%.2f%n", x);
		// Locale.setDefault(Locale.US);
		// System.out.println("O resultado é: " + x + " metros");
		// System.out.printf("O resultado é: %.2f metros%n", x);

		// System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
		// String nome = "Maria";
		// int idade = 31;
		// double renda = 4000.0;

		// System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,
		// renda);
		sc.close();

	}

}
