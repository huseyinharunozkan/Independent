import java.util.Scanner;

public class HeartRates_Main {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter name: ");
		String Name = hal.nextLine();
		System.out.print("Enter surname: ");
		String Surname = hal.nextLine();
		System.out.print("Enter  day of birth(1-31): ");
		byte Day = hal.nextByte();
		System.out.print("Enter  month of birth(1-12): ");
		byte Month = hal.nextByte();
		System.out.print("Enter  year of birth: ");
		int Year = hal.nextInt();

		HeartRates person = new HeartRates(Name, Surname, Day, Month, Year);
		System.out.printf("%s",person);
	}

}