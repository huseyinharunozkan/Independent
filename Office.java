package q1;

import java.util.Scanner;

public class Office {
	
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		String employee;
		do {
			
		
		System.out.println("Enter Employee Type (W/O):");
		employee = scan.nextLine();
		checkEmployee(employee);
		
		}while(!(employee.equalsIgnoreCase("q")));
		
	}
	
	public static void checkEmployee(String a) {
		if(a.equalsIgnoreCase("w")) {
			System.out.print("Enter Number of Days Worked :");
			int day = scan.nextInt();
			System.out.print("Enter Journal Fee: ");
			int journal = scan.nextInt();
			scan.nextLine();
			System.out.println("Fee Payable = "+(journal*day)+" TL");
			
			}
		else if(a.equalsIgnoreCase("o")) {
			System.out.print("Enter Title Score : ");
			int TScore = scan.nextInt();
			scan.nextLine();
			checkTitleScore(TScore);
			System.out.print("Enter Language Level : ");
			String LLevel = scan.nextLine();
			int LSalary = checkLanguageLevel (LLevel)*30;
			System.out.println("Fee Payable = "+(LSalary+TScore)+" TL");
			
			
		}
		else if(a.equalsIgnoreCase("q")) {
			System.out.println("PROCESS COMPLETED! THANKS!");
		}
		else {
			System.out.println("Faulty Employee Type!!");
		}
		}
	public static void checkTitleScore(int TScore) {
		if(TScore>1000&&TScore<0) {
			System.out.println("Faulty Title Score Range!!");
			
			
		}
	
		
		
	}
	public static int checkLanguageLevel (String LLevel) {
		if(LLevel.equals("A")) {
			return 100;
		}
		else if(LLevel.equals("B")) {
			return 80;
		}
		else if(LLevel.equals("C")) {
			return 60;
		}
		return 0;
		
	}
		
	}
