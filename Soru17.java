import java.util.Scanner;

public class Soru17 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		int j = 0;
		System.out.print("Please enter first number: ");
		int a = hal.nextInt();
		System.out.print("Please enter second number: ");
		int b = hal.nextInt();
		if (a > b) {
			int c = b;
			b = a;
			a = c;
		}
		for (int i = a; i <= b; i++) {
			if (i % 28 == 0) {
				System.out.print(i + ",");
				j++;
			}

		}
		System.out.println();
		System.out.println(j + " pieces in total.");
	}

}
