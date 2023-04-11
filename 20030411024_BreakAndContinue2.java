import java.util.Scanner;

public class BreakAndContinue2 {

	public static void main(String[] args) {
		Scanner job = new Scanner(System.in);
		int total = 0, i, number;

		for (i = 1; i <= 5; i++) {
			System.out.println("Please enter a value: ");
			number = job.nextInt();
			if (number <= 0) {
				i--;
				number = 0;
				continue;
			}
			total += number;
		}
		System.out.println("Total: " + total);

	}

}
