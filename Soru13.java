
public class Soru13 {

	public static void main(String[] args) {

		int j = 0;
		System.out.print("The queried numbers: ");
		for (int i = 100; i <= 999; i++) {
			int a = i / 100;
			int b = ((i - a * 100)) / 10;
			int c = i % 10;
			if ((a * a * a) + (b * b * b) + (c * c * c) == i) {
				System.out.print(i + ",");
				j++;
			}
		}
		System.out.println();
		System.out.printf("There are %d three-digit numbers with this feature.", j);
	}

}
