public class HealthProfile {

	private String name;
	private String surname;
	private byte day;
	private byte month;
	private int year;
	private double weight;
	private double height;
	private String gender;

	public HealthProfile(String name, String surname, byte day, byte month, int year, String gender, double weight,
			double height) {

		this.name = name;
		this.surname = surname;
		this.day = day;
		this.month = month;
		this.year = year;
		this.gender = gender;
		this.weight = weight;
		this.height = height;

	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public byte getDay() {
		return day;
	}

	public byte getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setName(String name) {

		this.name = name;
	}

	public void setSurname(String surname) {

		this.surname = surname;
	}

	public void setDay(byte day) {

		this.day = day;
	}

	public void setMonth(byte month) {

		this.month = month;
	}

	public void setYear(int year) {

		this.year = year;

	}

	public int getAge() {
		int age = (2022 - getYear());
		return age;
	}

	public int maxHeartRate() {
		int heartRate = 220 - getAge();
		return heartRate;
	}

	public int targetLowHR() {
		int a = maxHeartRate() * 50 / 100;
		return a;

	}

	public int targetHighHR() {
		int b = maxHeartRate() * 85 / 100;
		return b;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {

		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {

		this.height = height;
	}

	public double BMI() {
		double x = getWeight() / (getHeight() * getHeight());
		return x;
	}

	public String BMI2() {
		String a = null;
		if (BMI() < 18.5) {
			a = "Person is underweight.";
		} else if (BMI() >= 18.5 && BMI() <= 24.9) {
			a = "Person is normal.";
		} else if (BMI() <= 25 && BMI() <= 29.9) {
			a = "Person is overweight.";
		} else if (BMI() >= 30) {
			a = "Person is obese.";

		}
		return a;
	}

	public String toString() {

		return String.format(
				"%s: %s\n%s: %s\n%s: %d/%d/%d\n%s: %s\n%s: %.2f kg\n%s: %.2f m\n%s: %d\n%s: "
						+ "%d\n%s: %d-%d\n%s: %.2f\n%s",
				"Name", name, "Surname", surname, "Birthday", day, month, year, "Gender", gender, "Weight", weight,
				"Height", height, "Age", getAge(), "Max heart", maxHeartRate(), "Target heart rate range",
				targetLowHR(), targetHighHR(), "BMI", BMI(), BMI2());

	}
}