
public class StringOutputOperators {

	public static void main(String[] args) {
		String string1 = "Hello how are you?";
		String string2 = "good";
		
		System.out.println(string1.substring(0,15));
		System.out.println("how are you");
		System.out.printf("%5s\n",string2);
		System.out.printf("%-5s",string1);
	}

}
