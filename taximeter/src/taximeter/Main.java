package taximeter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int openingFee = 10;
		
		System.out.print("Enter distance traveled(km): ");
		int way = scan.nextInt();
		int price =  openingFee+(way*2);
		
		System.out.println("Amount to be paid: "+price);
		

	}

}
