package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Caixa_Lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int cod, qtde;
		double CQ = 4.00, XS = 4.50, XB = 5.00, TS = 2.00, RF = 1.5, vlr_temp;

		String cod1 = "Cachorro Quente";
		String cod2 = "X-Salada";
		String cod3 = "X-Bacon";
		String cod4 = "Torrada Simples";
		String cod5 = "Refrigerante";
		String prod_selec;

		System.out.println("Digite o código do produto:");

		cod = sc.nextInt();

		if (cod == 1) {
			System.out.println("Produto Selecionado: " + cod1);
			prod_selec = cod1;
			vlr_temp = CQ;
		} else if (cod == 2) {
			System.out.println("Produto Selecionado: " + cod2);
			prod_selec = cod2;
			vlr_temp = XS;
		} else if (cod == 3) {
			System.out.println("Produto Selecionado: " + cod3);
			prod_selec = cod3;
			vlr_temp = XB;
		} else if (cod == 4) {
			System.out.println("Produto Selecionado: " + cod4);
			prod_selec = cod4;
			vlr_temp = TS;
		} else if (cod > 5) {
			System.out.println("Produto Inexistente!");
			prod_selec = "Nenhum produto foi selecionado!";
			vlr_temp = 0;
		} else {
			System.out.println("Produto Selecionado: " + cod5);
			prod_selec = cod5;
			vlr_temp = RF;
		}

		System.out.println("Digite a quantidade:");

		qtde = sc.nextInt();

		System.out.printf("Valor Total: %.2f%n ", vlr_temp * qtde);

		sc.close();

	}
}
