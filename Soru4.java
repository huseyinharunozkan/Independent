import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter the four-digit number: ");
		int number = hal.nextInt();
		System.out.println("-------------------------");
		int a = number / 1000;

		int b = (number - (a * 1000)) / 100;

		int c = ((number - ((number / 100) * 100)) / 10);

		int d = number - number / 10 * 10;

		int x = a + b + c + d;
		if ( number<1000 || number>9999) {
			System.out.println("Did not enter four-digit number");
		}
		else if (x * x * x == number) {
			System.out.printf("The number %d entered is the number that fills the cube.", number);
		} else {
			System.out.printf("The number %d entered is not filling the cube.", number);
		}
	}

}
