
public class StringFunctions02_2 {

	public static void main(String[] args) {
		String string1 = "good moorning";
		String string2 = "good night";
		System.out.println(string1.substring(0, 3).compareTo(string2.substring(0, 3)));
		System.out.println(string1.substring(0, 6).compareTo(string2.substring(0, 6)));
	}

}
