
public class Formula_baskara {
	public static void main(String[] args) {

		double a, b, c, x1, x2, delta;

		a = 2.0;
		b = 9.0;
		c = 7.0;

		delta = Math.pow(b, 2.0) - 4.0 * a * c;

		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("O valor de delta é: " + delta);
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);
	}
}