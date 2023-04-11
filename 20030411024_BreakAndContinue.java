import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		Scanner aybu = new Scanner(System.in);
		int i, number;
		for (i = 1; i <= 10; i++) {
			System.out.print("Please enter a value: ");
			number = aybu.nextInt();
			if (number <= 0)
				break;

		}
		System.out.println(i - 1 + " positive number entered");
	}

}
