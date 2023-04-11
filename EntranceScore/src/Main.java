import java.util.Scanner;

public class Main {
	static String[] name = new String[10];
	static String[] surname = new String[10];
	static double[] GPA = new double[10];
	static double[] ales = new double[10];
	static double[] yds = new double[10];
	static double[] entSc = new double[10];
	static String student;
	static Scanner hal = new Scanner(System.in);

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.print("Please enter the name of the student " + (i + 1) + ": ");

			String nm = hal.nextLine();
			name[i] = nm;
			System.out.print("Please enter the surname of the student " + (i + 1) + ": ");
			String sn = hal.nextLine();
			surname[i] = sn;
			System.out.print("Please enter the GPA of the student " + (i + 1) + ": ");
			double gp = hal.nextDouble();

			if (gp < 2 || gp > 4) {
				System.out.println("this student is not eligible to apply or invalid number");
				hal.nextLine();
			} else {
				GPA[i] = gp;
				System.out.print("Please enter the ALES Grade of the student " + (i + 1) + ": ");
				double als = hal.nextDouble();

				if (als < 70 || als > 100) {
					System.out.println("this student is not eligible to apply");
					hal.nextLine();

				} else {
					ales[i] = als;
					System.out.print("Please enter the YDS score of the student " + (i + 1) + ": ");
					double ydsSc = hal.nextDouble();
					hal.nextLine();

					if (ydsSc < 55 || ydsSc > 100) {
						System.out.println("this student is not eligible to apply");

					} else {
						yds[i] = ydsSc;
						entSc[i] = (gp * 10) + (als * 0.3) + (ydsSc * 0.3);
					}

				}
			}
		}
		for (int r = 0; r < 999; r++) {
			for (int j = 1; j < 10; j++) { // to sort

				if (entSc[j] > entSc[j - 1]) {
					double x = entSc[j - 1];
					entSc[j - 1] = entSc[j];
					entSc[j] = x;
					String n = name[j - 1];
					name[j - 1] = name[j];
					name[j] = n;
					String sr = surname[j - 1];
					surname[j - 1] = surname[j];
					surname[j] = sr;
					double p = GPA[j - 1];
					GPA[j - 1] = GPA[j];
					GPA[j] = p;
					double als = ales[j - 1];
					ales[j - 1] = ales[j];
					ales[j] = als;
					double o = yds[j - 1];
					yds[j - 1] = yds[j];
					yds[j] = o;

				}

			}
		}
		System.out.println("Entrance Score\tName\tSurname\tGPA\tALES Score\tYDS Score");
		for (int h = 0; h < 10; h++) {
			System.out.printf("%.2f", entSc[h]);
			System.out.print(
					"\t\t" + name[h] + "\t" + surname[h] + "\t" + GPA[h] + "\t" + ales[h] + "\t\t" + yds[h] + "\n");
		}
		System.out.println();
		Student();

	}

	public static void Student() {
		do {
			System.out.print("Please enter the name of the student that you want to see the score: ");
			student = hal.nextLine();
			int found = 0;
			for (int j = 0; j < 10; j++) {
				if (student.equalsIgnoreCase(name[j])) {
					found++;
					System.out.println("Entrance Score\tName\tSurname\tGPA\tALES Score\tYDS Score");
					System.out.printf("%.2f", entSc[j]);
					System.out.print("\t\t" + name[j] + "\t" + surname[j] + "\t" + GPA[j] + "\t" + ales[j] + "\t\t"
							+ yds[j] + "\n");
				}
			}
			if (found == 0) {
				System.out.println("There is no such student");
			}
		} while (!student.equalsIgnoreCase("exit"));

	}

}
