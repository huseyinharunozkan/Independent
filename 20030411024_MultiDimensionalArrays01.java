
public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		int[][] b = { { 15, 30, 39 }, { 23, 65, 30 }, { 32, 61, 12 }, { 48, 34, 11 } };
		for (int i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print("\t" + b[i][j]);
			}

		}

		int[][] a = new int[30][3];
		for (int row = 0; row < 30; ++row) {
			for (int col = 0; col < 3; ++col) {
				a[row][col] = 0;
				System.out.println("\n" + a[row][col]);
			}
		}

	}

}
