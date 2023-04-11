import java.util.Scanner;

public class StringFunctions02_5 {

	public static void main(String[] args) {
		Scanner dwight = new Scanner(System.in);
		int k, i;
		System.out.println("Please enter a string");
		String str1 = dwight.nextLine();
		k = str1.length();
		for (i = 0; i < k; i++) {
			boolean p = Character.isAlphabetic(str1.charAt(i));

			if (p == true)
				System.out.print(str1.charAt(i));

		}

	}
}
