import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		Scanner Ronaldo = new Scanner(System.in);

		int i, j;

		for (i = 0, j = 0; i <= 4 && j >= -8; i++, j--) {

			System.out.printf("%4d %4d\n",i,j);
		}
		int total = 0;
		i = 1;
		for (; i <= 10; i++) {
			System.out.println(total += i);
		}
		total = 0;
		i = 1;
		for (; i <= 10;) {
			System.out.println(total += i);
			i++;
		}

	}

}
