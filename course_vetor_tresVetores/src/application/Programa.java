package application;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos valores vão ter em cada vetor? ");
		int n = sc.nextInt();

		int[] vectA = new int[n];
		int[] vectB = new int[n];
		
		System.out.println("Digite os valores do vetor A");
		for (int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}

		System.out.println("Digite os valores do vetor B");
		for (int i = 0; i < vectA.length; i++) {
			vectB[i] = sc.nextInt();
		}

		int[] vectC = new int[n];

		System.out.println("VALOR RESULTANTE: ");
		for (int i = 0; i < vectA.length; i++) {
			vectC[i] = vectA[i] + vectB[i];
			System.out.println(vectC[i]);
		}
		sc.close();
	}

}
