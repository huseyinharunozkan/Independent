
public class String01_4 {

	public static void main(String[] args) {
		String name = "string is here                    ";

		for (int i = 0; name.charAt(i) != ' '; i++) {
			System.out.print(name.charAt(i));

		}
		System.out.println(": 1");
		for (int i = 0; i < 30; i++) {
			System.out.print(name.charAt(i));

		}
		System.out.println(": 1");
	}

}
