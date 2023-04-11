
public class StringFunc01_2 {

	public static void main(String[] args) {
		String name = "Ihsan Tolga Medeni";
		String firstName = name.substring(0, 5);
		String middleName = name.substring(6, 11);
		String lastName = name.substring(12, 18);
		System.out.println(firstName);
		System.out.println(middleName);
		System.out.println(lastName);
	}

}
