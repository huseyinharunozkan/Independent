import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		Scanner harley = new Scanner(System.in);
		int year;
		System.out.println("Please enter the Year of the Uni Student: ");
		year = harley.nextInt();

		if (year == 1) {
			System.out.println("The student is a Freshman");
		}
		if (year == 2) {
			System.out.println("The student is a Sophomore");
		}
		if (year == 3) {
			System.out.println("The student is a Junior");
		}
		if (year == 4) {
			System.out.println("The student is a Senior");
		}
		if (year < 1 || year > 4) {
			System.out.println("The value must be in between 1 and 4");
		}
		switch (year) {
		case 1:
			System.out.println("The student is a Freshman");
			break;
		case 2:
			System.out.println("The student is a Sophomore");
			break;
		case 3:
			System.out.println("The student is a Junior");
			break;
		case 4:
			System.out.println("The student is a Senior");
			break;
		default:
			System.out.println("The value must be in between 1 and 4");

		}
	}

}
