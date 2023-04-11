import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter your age: ");
		byte age = hal.nextByte();
		System.out.print("Enter your weight (kg): ");
		short weight = hal.nextShort();
		System.out.print("Enter your height (m): ");
		double height = hal.nextDouble();
		System.out.println("-------------------------");

		double BMI = weight / (height * height);
		System.out.printf("Your body mass index: %.2f\n", BMI);

		if (age >= 13 && age <= 17 && BMI <= 24.99 && BMI >= 18.50) {
			System.out.println("Congratulations you can enter military high school.");
		} else {
			System.out.println("Sorry,you cannot enter military high school.");

		}
	}

}
