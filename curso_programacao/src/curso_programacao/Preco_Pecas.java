package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Preco_Pecas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_1, cod_2, qtde1, qtde2;
		
		double val_unit1, val_unit2, val_tot1, val_tot2;
		
		cod_1 = sc.nextInt();
		qtde1 = sc.nextInt();
		val_unit1 = sc.nextDouble();
		
		cod_2 = sc.nextInt();
		qtde2 = sc.nextInt();
		val_unit2 = sc.nextDouble();
		
		val_tot1 = qtde1 * val_unit1;
		val_tot2 = qtde2 * val_unit2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n" , val_tot1 + val_tot2);
		
		sc.close();
	}

}