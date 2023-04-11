import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		Scanner hal = new Scanner(System.in);
		System.out.println("What's the total amount including VAT ?");
		double price = hal.nextDouble();
		double excludeVAT = price / (1.18);
		double VAT = excludeVAT * 18 / 100;
		System.out.printf("The amount of VAT: %.2f", VAT);

		System.out.printf("\nPrice of goods services excluding VAT: %.2f", excludeVAT);

	}

}
