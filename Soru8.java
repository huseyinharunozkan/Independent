import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter the four-digit number: ");
		int number = hal.nextInt();

		int x = number / 100;
		int y = number - (number / 100) * 100;

		int a = number / 1000;

		int b = ((number - (a * 1000)) / 100);

		int c = (number % 100) / 10;

		int d = (number % 10);

		if (number < 1000 || number > 9999) {
			System.out.println("Did not enter four-digit number");

		} else if (x * y == (a + b * 10) * (c + d * 10)) {
			System.out.println("The number entered is an inverted number.");
		} else {
			System.out.println("The number entered is not an inverted number.");
		}

	}

}
