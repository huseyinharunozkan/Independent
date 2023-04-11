
public class StringFunctions02 {

	public static void main(String[] args) {
		String string1 = "hello";
		String string2 = "hello";
		System.out.println(string1.compareTo(string2));
		string1 = "hello";
		string2 = "goodbye";
		System.out.println(string1.compareTo(string2));
		string1 = "goodbye";
		string2 = "hello";
		System.out.println(string1.compareTo(string2));

	}

}
