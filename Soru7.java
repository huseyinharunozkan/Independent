import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter fuel consumption per km (lt): ");
		double kmfuel = hal.nextDouble();
		System.out.print("Enter price of 1 liter of fuel (YTL): ");
		double price = hal.nextDouble();
		System.out.print("Enter the total distance covered by the vehicle (km): ");
		double distance = hal.nextDouble();
		System.out.printf("Total fuel cost: %.2f YTL" ,(kmfuel * distance * price) );
	}

}
