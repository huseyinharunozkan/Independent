import java.util.Scanner;

public class Soru11 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		int weight;
		int l = 0, m = 0, h = 0,  numb = 0;
		double total = 0;
		do {
			System.out.print("Enter weight: ");
			weight = hal.nextInt();

			if (weight < 0) {
				System.out.println("Entered wrong number.");
			} else if (weight != 0 && weight < 50) {
				;
				l++;
			} else if (weight >= 50 && weight < 70) {
				m++;
			} else if (weight >= 70) {
				h++;
			}

			if (weight > 0) {
				total += weight;
				numb++;
			}
		} while (weight != 0);
		System.out.println((l+m+h)+" athlete weights have been entered.");
		System.out.printf("There are %d light, %d medium and %d heavy weights.\n", l, m, h);
		double average = total / numb;
		System.out.printf("Average weight of all athletes is: %.2f " ,average);
	}

}
