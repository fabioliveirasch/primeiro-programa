package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos clientes serão cadastrados? ");
		int qtdeClient = sc.nextInt();
		
		int ids[] = new int[qtdeClient];
		String nomes[] = new String[qtdeClient];
		String emails[] = new String[qtdeClient];
		
		for (int i = 0; i < qtdeClient; i++) {
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("E-mail: ");
			String email = sc.nextLine();
			
		}
		

	}

}
