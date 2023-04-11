
public class FunctionVariableScope {
	public static int a = 3;

	public static void main(String[] args) {
		int x, y;

		x = 10;
		y = 5;
		System.out.printf("%3d%3d%3d\n", x, y, a);
		f(x);
		a = a + 1;
		System.out.printf("%3d%3d%3d\n", x, y, a);

	}

	public static void f(int k) {
		int s = k + 1;
		k = k * 3;
		a = a + 1;
		System.out.printf("%3d%3d%3d\n", k, s, a);

	}

}
