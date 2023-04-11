import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner Jota = new Scanner(System.in);
		String word;
		char[] a = new char[6];
		word = Jota.nextLine();

		System.out.println(word.substring(0, 7));

		System.out.println("------------");

		String name1 = "Tolga is 40 years old";
		System.out.println(name1.substring(0, 5) + "===>" + name1.substring(9, 11));

	}

}
