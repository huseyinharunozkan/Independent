
public class StringOutputOperators2 {

	public static void main(String[] args) {
		double gas = 47.0;
		double km = 300;
		String gas_Km = String.format("km. for %5.3f lt. gas burns", km / gas);
		System.out.print(gas_Km);

	}

}
