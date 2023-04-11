
import java.util.*;

public class DimArrayExample {
	public static void average(int student_number, int exam_number, int[][] grade, double[] aver) {
		double total;
		int i, j;
		for (i = 0; i < student_number; ++i) {
			total = 0;
			for (j = 0; j < exam_number; ++j)
				total += grade[i][j];
			aver[i] = total / 3.0;
		}
	}

	public static void main(String[] args) {
		Random rnd = new Random();
		int[][] test = new int[30][3];
		int i, j;
		double[] average_1 = new double[30];
		for (i = 0; i < 30; ++i) {
			System.out.printf("%d. students notes:", i + 1);
			for (j = 0; j < 3; ++j) {
				int randomNumber = rnd.nextInt(100);
				test[i][j] = randomNumber;
				System.out.print(" " + test[i][j]);
			}
			System.out.println();
		}
		average(30, 3, test, average_1);

		for (i = 0; i < 30; ++i) {

			System.out.printf("%d. Student Average is:%5.2f \n", i + 1, average_1[i]);
		}

	}
}
