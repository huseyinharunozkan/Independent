package çalýþma;

import java.util.Scanner;
import java.util.Arrays;

public class $20030411024$LastToMaxNumber {

	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		int[] max = new int[2];
		max[0] = 0;
		max[1] = 0;
		for (int i = 0; i < 1;) {
			System.out.println("Enter a number: ");
			int number = x.nextInt();
			if (number == max[0] || number == max[1]) {

			} else if (number > max[1]) {
				max[0] = max[1];
				max[1] = number;
			} else if (number > max[0]) {
				max[0] = number;

			} else if (number < 0 && number != -1) {
				System.out.println("You entered an invalid number!");
			} else if (number == -1) {
				break;
			}
		}
		System.out.println(Arrays.toString(max));
		System.out.println("The biggest number is: " + max[1]);
		System.out.println("The second biggest number is: " + max[0]);

	}
}

		
		
		
		
		
	  
