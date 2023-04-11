import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		Scanner oley = new Scanner(System.in);
		int answer;
		double a, r, area;
		do {
			System.out.println(
					"Please enter 1,2 or 3 \n 1 for are of Square \n 2 for area of Circle\n 3 for stop execution ");
			System.out.println("Please enter your option: ");
			answer = oley.nextInt();
			switch (answer) {
			case 1:
				System.out.println("Please enter the edge of the square: ");
				a = oley.nextDouble();
				System.out.printf("The area is: %.2f \n", a * a);
				break;
			case 2:
				System.out.println("Please enter the radius of the circle: ");
				r = oley.nextDouble();
				System.out.printf("The area is: %.2f\n", Math.PI * r * r);
				break;
			}
		} while (answer != 3);

	}

}
