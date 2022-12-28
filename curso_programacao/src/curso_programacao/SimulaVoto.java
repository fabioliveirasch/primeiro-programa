package curso_programacao;

import java.util.Scanner;

public class SimulaVoto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int B = 0, L = 0, V = 0;
		
		System.out.println("Digite o número do teu candidato e tecle enter");
		
		V = sc.nextInt();
		
		for (int i=1; i <= 10; i++) {
			if (V == 13) {
				L = L+3;				
			} else {
				B = L+1;
			}
			V = sc.nextInt();

		}
		
		System.out.println("Resultado das eleições:");
		System.out.println("O Candidato 22 (Bolsonaro) recebeu " + B + " votos");
		System.out.println("O Candidato 13 (Lula) recebeu " + L + " votos");
		
		sc.close();

	}

}
