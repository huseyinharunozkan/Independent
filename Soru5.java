import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter the first index: ");
		int firstIndex = hal.nextInt();
		System.out.print("Enter the last index: ");
		int lastIndex = hal.nextInt();

		System.out.println("-------------------------");

		if (firstIndex < 0 || lastIndex < 0) {
			System.out.println("You entered negative value");

		}
		else if (firstIndex > lastIndex) {
			System.out.println("The first index cannot be greater than to the last index.");
		} else {
			int consumptionAmount = lastIndex - firstIndex;

			System.out.println("Consumption amount: " + consumptionAmount);
			double consumptionPrice = (double) (consumptionAmount * 0.159838);
			System.out.printf("Consumption amount price: %.2f\n", consumptionPrice);
			double VAT = consumptionPrice * 22 / 100;
			System.out.print("VAT (%22): ");
			System.out.printf("%.3f\n", VAT);
			System.out.println("-------------------------");
			System.out.printf("TOTAL: %.3f", (consumptionPrice + VAT));
		}
	}

}
