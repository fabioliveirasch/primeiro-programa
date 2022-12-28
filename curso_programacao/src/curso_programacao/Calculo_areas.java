package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Calculo_areas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, TRI, CIRC, TRAP, QUAD, RET, pi = 3.14159;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRI = (A * C)/2;
		CIRC = pi * C * C;
		TRAP = ((A + B) * C)/2;
		QUAD = B * B;
		RET = A * B;
		
		System.out.printf("TRIÂNGULO = %.3f%n", TRI);		
		System.out.printf("CÍRCULO = %.3f%n", CIRC);
		System.out.printf("TRAPÉZIO = %.3f%n", TRAP);
		System.out.printf("QUADRADO = %.3f%n", QUAD);
		System.out.printf("RETÂNGULO = %.3f%n", RET);
		
		sc.close();
	}

}
