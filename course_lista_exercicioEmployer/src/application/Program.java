package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos empregados serão cadastrados? ");
		int n = sc.nextInt();

		List<Funcionario> list = new ArrayList<>();//Tipo list não é uma classe é uma interface

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Empregado #" + (i + 1) + ":");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Esse id já existe! Tente novamente.");
			}

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Salário: ");
			Double salario = sc.nextDouble();
			list.add(new Funcionario(id, nome, salario));
		}
		
		System.out.print("Informe o id do funcionário que terá aumento salarial: ");
		Integer id = sc.nextInt();
		
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Id inexistente!");
		} 
		else {
			System.out.println("Informe a porcentagem do aumento: ");
			Double porcentagem = sc.nextDouble();
			emp.aumen_salar(porcentagem);
		}
		
		System.out.println();
		System.out.println("Relação dos empregados:");
		for (Funcionario obj : list) {
			System.out.println(obj);
		}		
		
		sc.close();
	}
	
	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
