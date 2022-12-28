package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter CurrencyConverter = new entities.CurrencyConverter();
		
		System.out.print("Qual o valor atualizado do dólar? ");
		CurrencyConverter.vlrUnitDol = sc.nextDouble();
		
		System.out.print("Quantos dólares você quer comprar? ");
		CurrencyConverter.qtdeDolar  = sc.nextDouble();		
		
		System.out.printf("Valor a ser pago em reais é: %.2f%n", CurrencyConverter.total());
		
	}

}
