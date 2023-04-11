
public class StringFunc01_3 {

	public static void main(String[] args) {
		String string1 = "good";
		String string2 = "night";
		System.out.printf("String1 Before: %s %d \n", string1, string1.length());
		string1 = string1.concat(string2);
		System.out.printf("String1: %s %d \n", string1, string1.length());
		System.out.printf("String2: %s %d \n", string2, string2.length());
	}

}
