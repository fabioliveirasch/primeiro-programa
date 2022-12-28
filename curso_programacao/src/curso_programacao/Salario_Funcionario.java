package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Salario_Funcionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Func, Horas;
		double Sal, Valor_hora;
		
		Func = sc.nextInt();
		Horas = sc.nextInt();
		Valor_hora = sc.nextDouble();
		
		Sal = Horas * Valor_hora;
		
		System.out.println("NUMBER = " + Func);
		System.out.printf("SALARY = U$ %.2f%n", Sal);
		
		sc.close();

	}

}
