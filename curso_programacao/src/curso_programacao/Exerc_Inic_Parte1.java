package curso_programacao;

import java.util.Scanner;

public class Exerc_Inic_Parte1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int Valor1 = sc.nextInt();
		int Valor2 = sc.nextInt();
		
		int Soma;
		
		Soma = Valor1 + Valor2;
		
		System.out.println("A soma dos valores foi = " + Soma);
		
		sc.close();
		
	
	}

}
