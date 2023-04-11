
public class ArrayPointerFunction {

	public static void main(String[] args) {
		double total;
		float a[] = { 1, 2, 3, 4 };
		total = add(a);
		System.out.printf("%f", total);

	}

	public static float add(float apar[]) {
		int i;
		float total = 0;
		for (i = 0; i < 4; i++)
			total += apar[i];
		return total;
	}
}
