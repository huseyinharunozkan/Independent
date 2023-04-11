import java.util.Scanner;

public class WhileLoop3 {

	public static void main(String[] args) {
		Scanner gordon = new Scanner(System.in);
		int max = 0;
		int number;

		System.out.println("Enter a number: ");
		number = gordon.nextInt();
		while (number >= 0) {
			System.out.println("Enter a number: ");
			number = gordon.nextInt();
			if (number > max) {
				max = number;

			}
		}

		System.out.println("The largest number is: " + max);
	}

}
