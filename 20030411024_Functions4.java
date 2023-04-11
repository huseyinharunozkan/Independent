import java.util.Scanner;

public class Functions4 {

	public static void main(String[] args) {

		int sum = add();

		System.out.printf("The result is: %d ", sum);

	}

	public static int add() {
		Scanner lala = new Scanner(System.in);
		System.out.println("Please enter two values to add: ");

		int x = lala.nextInt();
		int y = lala.nextInt();
		return x + y;

	}
}
