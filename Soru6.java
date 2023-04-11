import java.util.Scanner;

public class Soru6 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter the traffic wrong number: ");
		byte twn = hal.nextByte();
		System.out.print("Enter the wrong number of engine: ");
		byte ewn = hal.nextByte();
		System.out.print("Enter first aid wrong number: ");
		byte fawn = hal.nextByte();
		System.out.println("-------------------------");
		double ts = 100 - twn * 2;
		double es = 100 - ewn * 2.5;
		double fas = (double) (100 - fawn * 3.3333);
		System.out.printf("Your traffic score: %.2f\n", ts);
		System.out.printf("Your engine score: %.2f\n", es);
		System.out.printf("Your first aid score: %.2f\n", fas - 0.005);

		if (ts >= 70 && es >= 70 && fas >= 70) {
			System.out.print("Congratulations you can take the steering test.");
		} else {
			System.out.print("Sorry, you cannot take the steering test.");
		}
	}

}
