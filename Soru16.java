import java.util.Scanner;

public class Soru16 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		int j = 0;
		System.out.print("Enter the first number: ");
		int a = hal.nextInt();
		System.out.print("Enter the second number: ");
		int b = hal.nextInt();
		if(a>b) {
			int c = b;
			b = a;
			a = c;
		}
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0 || i % 11 == 0) {
				System.out.print(i + ",");
				j++;
			}

		}
		System.out.printf("\nThere are %d numbers in total that comply with the rule.",j);
	}

}
