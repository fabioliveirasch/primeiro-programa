package curso_programacao;

import java.util.Scanner;

public class Horas_Jogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Hi, Hf, Dur, temp;

		Hi = sc.nextInt();
		Hf = sc.nextInt();

		Dur = Hf - Hi;

		if (Hf - Hi == 0) {
			System.out.println("O JOGO DUROU 24 HORA(S)!");
		} else {
			if (Hf > Hi) {
				System.out.println("O JOGO DUROU " + Dur + " HORA(S)!");
			} else {
				temp = (24 - Hi) + (Hf - 0);
				System.out.println("O JOGO DUROU " + temp + " HORA(S)!");
			}
		}
		sc.close();
	}
}
