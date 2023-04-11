import java.util.Scanner;

public class MultiFunctionalPrograms {

	public static void main(String[] args) {
		Scanner jane = new Scanner(System.in);

		int k, s, answer;
		System.out.println("Please enter two values(integer)");
		k = jane.nextInt();
		s = jane.nextInt();
		answer = combination(k, s);
		System.out.printf("combination = %3d ", answer);

	}

	public static int factorial(int k) {
		int i, s = 1;
		for (i = 1; i <= k; ++i)
			s *= i;
		return (s);

	}

	public static int combination(int n, int r) {
		int s;
		s = factorial(n) / (factorial(r) * factorial(n - r));
		return (s);

	}
}
