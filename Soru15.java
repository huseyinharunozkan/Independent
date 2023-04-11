import java.util.Scanner;

public class Soru15 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		short x;
		int r = 0;
		int g = 0;
		int y = 0;
		int b = 0;
		do {

			System.out.print("Enter code (1,2,3,4 or 111 to exit): ");
			x = hal.nextShort();
			if (x == 1) {
				r++;
			} else if (x == 2) {
				g++;
			} else if (x == 3) {
				y++;
			} else if (x == 4) {
				b++;
			} else if ((x > 4 || x < 1) && x != 111) {
				System.out.println("Error!! Please enter a valid code.");

			}
		} while (x != 111);
		System.out.println("End of Day Sales Report:");
		System.out.printf("%d red, %d green, %d yellow, %d black.", r, g, y, b);
	}

}
