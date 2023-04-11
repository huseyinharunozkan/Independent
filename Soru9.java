import java.util.Scanner;

public class Soru9 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter ALES score: ");
		double ales = hal.nextDouble();
		System.out.print("Enter the foreign language score: ");
		double fls = hal.nextDouble();
		System.out.print("Enter Graduation GPA: ");
		double Gpa = hal.nextDouble();
		double ranks = ales * 0.5 + fls * 0.25 + Gpa * 0.25;
		
		if (ales < 0 || ales > 100 || fls < 0 || fls > 100 || Gpa < 0 || Gpa > 100) {
			System.out.println("You entered negative value or bigger than 100.");
		} else if (ranks >= 60) {
			System.out.println("Your ranking score: " + ranks);
			System.out.println("May enter the rankings");
		} else {
			System.out.println("May not enter the rankings");
		}
	}

}
