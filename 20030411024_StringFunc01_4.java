
public class StringFunc01_4 {

	public static void main(String[] args) {
		String string1 = "have a good day";
		String string2 = "thank you";

		string1 = string1.concat(string2.substring(0, 5));
		System.out.println(string1);
		System.out.println(string2);

	}

}
