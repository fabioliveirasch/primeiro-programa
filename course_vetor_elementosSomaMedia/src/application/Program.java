package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for (int i=0; i<vect.length; i++) {
			vect[i] = sc.nextDouble();						
		}
		
		System.out.print("VALORES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i] + " ");
		}
		
		double soma = 0;
		System.out.println();
		System.out.print("SOMA = ");
		for (int i=0; i<vect.length; i++) {
			soma = soma + vect[i];
		}
		System.out.println(soma);
		
		System.out.print("MÉDIA = " + soma / vect.length);
		
		sc.close();
	}
}
