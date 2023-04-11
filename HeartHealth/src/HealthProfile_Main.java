import java.util.Scanner;

public class HealthProfile_Main {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String Name = hal.nextLine();
		System.out.print("Enter your surname: ");
		String Surname = hal.nextLine();
		System.out.print("Enter your day of birth(1-31): ");
		byte Day = hal.nextByte();
		System.out.print("Enter your month of birth(1-12): ");
		byte Month = hal.nextByte();
		System.out.print("Enter your year of birth: ");
		int Year = hal.nextInt();
		System.out.print("Enter your gender(male/female): ");
		String Gender = hal.next();
		System.out.print("Enter your weight(kg): ");
		double Weight = hal.nextDouble();
		System.out.print("Enter your height(m): ");
		double Height = hal.nextDouble();
		

		HealthProfile person = new HealthProfile(Name, Surname, Day, Month, Year, Gender, Weight, Height);
		System.out.printf("%s",person);
		
	}

}