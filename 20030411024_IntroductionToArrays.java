import java.util.Scanner;

public class IntroductionToArrays {

	public static void main(String[] args) {
		Scanner ops = new Scanner(System.in);
		int[] a = new int[5];
		int i, total;
		double average;
		System.out.println("Please enter 5 integer value");
		for (i = 0; i < 5; i++)
			a[i] = ops.nextInt();
			total = 0;

		for (i = 0; i < 5; i++)
			total = total + a[i];
			average = total / 5.0;
			System.out.printf("The average is = %5.2f ", average);

	}

}
