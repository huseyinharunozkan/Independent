import java.util.Scanner;

public class Soru10 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.print("Enter the starting and ending value: ");
		int snumber = hal.nextInt();
		int lnumber = hal.nextInt();
		int j = 0;

		if (snumber > 0 && lnumber > 0 && lnumber > snumber) {
			for (int i = snumber; i <= lnumber; i++) {
				if (i % 2 == 0 && i != lnumber && i != lnumber - 1) {
					System.out.print(i + ",");
					j++;
				} else if (i % 2 == 0) {
					System.out.println(i);
					j++;

				}

			}
		} else if (snumber > 0 && lnumber > 0 && lnumber < snumber) {
			for (int i = snumber; i >= lnumber; i--) {
				if (i % 2 == 0 && i != lnumber && i != lnumber + 1) {
					System.out.print(i + ",");
					j++;
				} else if (i % 2 == 0) {
					System.out.println(i);
					j++;

				}

			}

		}
		if (snumber > 0 && lnumber > 0)
			System.out.println((j) + " numbers in total");
		else {
			System.out.println("Entered negative number or zero(you can enter only positive integer).");
		}
	}

}
