
public class String01_5 {

	public static void main(String[] args) {
		String sentence = "hello world!";
		int count = 0;
		int i;
		for (i = 0; sentence.charAt(i) != '!'; i++) {
			count++;
		}
		System.out.printf("%s %d character.", sentence, count);

	}

}
