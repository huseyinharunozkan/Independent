import java.util.Scanner;

public class Functions {

	public static void main(String[] args) {
		add();

	}

	public static void add() {
		Scanner lala = new Scanner(System.in);
		System.out.println("Please enter two values to add: ");
		int x = lala.nextInt();
		int y = lala.nextInt();
		System.out.println("The result is: " + (x + y));

	}
}