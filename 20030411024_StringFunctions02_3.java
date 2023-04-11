import java.util.Scanner;

public class StringFunctions02_3 {

	public static void main(String[] args) {
		Scanner cani = new Scanner(System.in);
		System.out.println("Enter a string");
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append(cani.nextLine());
		StringBuffer string2 = (strBuffer.reverse());
		System.out.println(string2);

	}

}
