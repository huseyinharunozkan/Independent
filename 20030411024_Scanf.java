import java.util.Scanner;

public class Scanf {

	public static void main(String[] args) {
		Scanner joker = new Scanner(System.in);
		int a = joker.nextInt();
		int b = joker.nextInt();
		System.out.println(a + " " + b);

		double c, d;
		c = joker.nextDouble();
		d = joker.nextDouble();
		System.out.println(c + " " + d);

	}

}
