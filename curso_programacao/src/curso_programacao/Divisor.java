package curso_programacao;

import java.util.Iterator;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int div;

		for (int i = 1; i <= n; i++) {
			if ((n % i) == 0) {
				System.out.println(i);
			} else {
			}
		}

		sc.close();
	}

}
