
public class Soru14 {

	public static void main(String[] args) {
		int j = 0;
		System.out.print("Numbers ");
		for (int i = 1000; i <= 9999; i++) {
			int x = i / 100;
			int y = i % 100;
			if ((x + y) * (x + y) == i) {
				System.out.print(i + ",");
				j++;

			}

		}
		System.out.println("\nTotal = " + j + " pieces");

	}

}
