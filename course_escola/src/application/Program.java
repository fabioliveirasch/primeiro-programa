package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Insira a 1ª nota: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("Insira a 2ª nota: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("Insira a 3ª nota: ");
		aluno.n3 = sc.nextDouble();

		System.out.println();
		System.out.printf("Nota final: %.2f%n", aluno.notaFinal());

		if (aluno.notaFinal() < 60.0) {
			System.out.println("Reprovado");
			System.out.println("Faltando: " + aluno.pontosFaltantes() + " Pontos");
		} else {
			System.out.println("Aprovado");
		}

	}
}