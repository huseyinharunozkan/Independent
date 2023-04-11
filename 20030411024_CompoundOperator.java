
public class CompoundOperator {

	public static void main(String[] args) {
		int multip = 4;
		int k = 8;
		multip = multip * k;
		System.out.print("The result is: " + multip);
		multip = 4;
		k = 8;
		multip *= k;
		System.out.println("The result is: " + multip);
		int i = 10;
		i = i + 1;
		System.out.print("The result is: " + i);
		i = 10;
		i += 1;
		System.out.println("The result is: " + i);
		i = 10;
		i = i - 1;
		System.out.print("The result is: " + i);
		i = 10;
		i -= 1;
		System.out.println("The result is: " + i);
		int term = 10, n = 9;
		term = term / (n * (n - 1));
		System.out.print("The result is: " + n);
		term = 10;
		n = 9;
		term /= (n * (n - 1));
		System.out.println("The result is: " + n);
	}

}
