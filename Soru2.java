import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter the four-digit number: ");
		int number = hal.nextInt();
		System.out.println("-------------------------");

		int a =  (number / 100);
		int b =  (number - (number / 100 * 100));

		if(number<1000 || number>9999) {
			System.out.println("Did not enter four-digit number");
		}
		else if ((a + b) * (a + b) == number){
			System.out.println("The number entered is semi-square number.");
		} else {
			System.out.println("The number entered is not a semi-square number.");
		}

	}

}
