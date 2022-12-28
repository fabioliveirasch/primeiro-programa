package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Quantos empregados serão cadastrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Este id já existe. Tente novamente! ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee emp = new Employee(id, nome, salary); // instanciar um funcionario

			list.add(emp); // inserir o funcionario instanciado na lista
		}

		System.out.println();
		System.out.print("Digite o id do funcionário que irá receber o aumento de salário: ");
		Integer idsalary = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);// Outra opção

		// Integer pos = position(list, idsalary);

		// if (pos == null) {

		if (emp == null) { // Outra opção
			System.out.println("Id inexistente!");
		} else

		{
			System.out.print("Digite a porcentagem do aumento: ");
			Double porcentagem = sc.nextDouble();
			// list.get(pos).increaseSalary(porcentagem);
			emp.increaseSalary(porcentagem); // outra opção

		}

		System.out.println();
		System.out.println("Lista dos funcionários");
		// for (Employee emp : list) {
		for (Employee e : list) { // Outra opção
			System.out.println(e);
		}

		sc.close();
	}

	// Função auxiliar para procurar um elemento na lista
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) { // get é a função que pega o elemento na posição
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
