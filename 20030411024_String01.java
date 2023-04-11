
public class String01 {

	public static void main(String[] args) {
		char[] word = new char[11];
		System.out.println(word[0]);
		word[0] = 'A';
		System.out.println(word[0]);
		word[1] = 'l';
		word[2] = 'i';
		System.out.println(word[1]);
		System.out.println(word[2]);
		System.out.println(word[3]);
		word[3] = '\0';
		System.out.println(word[3]);
	}

}
