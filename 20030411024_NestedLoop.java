
public class NestedLoop {

	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 8; i++) {
			for (j = i; j >= 1; j--)
				System.out.printf("%3d", j);
			System.out.println();
		}

	}

}
