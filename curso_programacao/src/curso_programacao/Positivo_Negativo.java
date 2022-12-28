package curso_programacao;

import java.util.Scanner;

public class Positivo_Negativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N >= 0) {
			System.out.println("O número digitado é: NÃO NEGATIVO");		
		}
		else {
			System.out.println("O número digitado é: NEGATIVO");
		}
		sc.close();
	}
}
