import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
		String ornek = "5";
		int x = Integer.parseInt(ornek);
		double a = 5.4;
		System.out.print(x + "\t");
		int a1 = (int) a;
		System.out.print(a1 + "\t");
		ornek = "5\t d";

		char[] b = ornek.toCharArray();
		System.out.print(b);
		char y = 4;
		System.out.println("\t" + y);

		System.out.println("--------------------");
		Scanner mic = new Scanner(System.in);
		System.out.println("For integer enter: 1\nfor double enter: 2\nfor char enter: 3");
		System.out.print("Time to choose:");
		int i = mic.nextInt();
		if (i == 1) {
			System.out.println("Please enter a integer value");
			Integer();
		} else if (i == 2) {
			System.out.println("Please enter a double value");
			Double();
		} else if (i == 3) {
			System.out.println("Please enter a char value");
			Char();
		} else {
			System.out.println("WRONG CHOOSE!");
		}

	}

	public static void Integer() {
		Scanner mic = new Scanner(System.in);
		int a = mic.nextInt();
		System.out.println(a);

	}

	public static void Double() {
		Scanner mic = new Scanner(System.in);
		double a = mic.nextDouble();
		System.out.println(a);

	}

	public static void Char() {
		Scanner mic = new Scanner(System.in);
		char a = mic.next().charAt(0);
		System.out.println(a);

	}
}
