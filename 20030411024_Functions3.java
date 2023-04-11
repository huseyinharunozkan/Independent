import java.util.Scanner;

public class Functions3 {

	public static void main(String[] args) {
		Scanner lala = new Scanner(System.in);
		System.out.println("Please enter two values to add: ");
		int x, y;
		x = lala.nextInt();
		y = lala.nextInt();

		System.out.printf("The result is: %d ", add(x, y));

	}

	public static int add(int a, int b) {

		return a + b;

	}
}