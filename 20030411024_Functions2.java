import java.util.Scanner;

public class Functions2 {

	public static void main(String[] args) {
		Scanner lala = new Scanner(System.in);
		System.out.println("Please enter two values to add: ");
		int x = lala.nextInt();
		int y = lala.nextInt();
		add(x, y);

	}

	public static void add(int a, int b) {
		System.out.println("The result is: " + (a + b));

	}
}