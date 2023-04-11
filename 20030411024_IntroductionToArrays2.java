import java.util.Scanner;

public class IntroductionToArrays2 {

	public static void main(String[] args) {
		Scanner ops = new Scanner(System.in);
		int[] a = new int[5];
		int i, total = 0;
		double average;
		System.out.println("Please enter 5 integer value");
		for (i = 0; i < 5; i++) {
			a[i] = ops.nextInt();
			total = total + a[i];
		}

		System.out.printf("The average is = %5.2f ", total / 5.0);

	}

}
