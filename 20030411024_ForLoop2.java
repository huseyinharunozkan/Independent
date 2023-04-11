import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		Scanner Messi = new Scanner(System.in);
		int pos = 0, neg = 0, zero = 0, n, number, i;
		System.out.print("Please enter how many numbers will be entered: ");
		n = Messi.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.print(i + ".number?: ");
			number = Messi.nextInt();
			if (number > 0) {
				pos++;
			} else if (number < 0) {
				neg++;
			} else {
				zero++;
			}

		}
		System.out.println("Times positive values are entered: " + pos);
		System.out.println("Times negative values are entered: " + neg);
		System.out.println("Times zero values are entered: " + zero);

	}

}
