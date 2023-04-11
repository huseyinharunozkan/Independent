import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner barbie = new Scanner(System.in);
		int number;
		System.out.println("Please enter a positive value: ");
		number = barbie.nextInt();
		while (number <= 0) {

			System.out.println("Please do not enter a negative value or 0");
			number = barbie.nextInt();
		}

		System.out.println("The last value is a positive value: " + number);

	}

}
