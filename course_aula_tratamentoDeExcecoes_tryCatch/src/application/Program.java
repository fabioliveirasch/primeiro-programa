package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();
		
		System.out.println();
		System.out.println("Programa encerrado!");

	}
	
	public static void method1() {
		System.out.println("**** Method1 Início ****");
		method2();
		System.out.println("**** Method1 Final ****");

		
	}


	public static void method2() {
		System.out.println("**** Method2 Início ****");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			System.out.println();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inexistente!");
			e.printStackTrace();
			sc.next();
		}

		catch (java.util.InputMismatchException a) {
			System.out.println("Caracter inválido!");
		}

		sc.close();
		System.out.println("**** Method2 Final ****");

	}

}
