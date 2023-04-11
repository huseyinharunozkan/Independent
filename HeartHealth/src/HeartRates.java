
public class HeartRates {

	private String name;
	private String surname;
	private byte day;
	private byte month;
	private int year;

	public HeartRates(String name, String surname, byte day, byte month, int year) {

		this.name=name;
		this.surname=surname;
		this.day=day;
		this.month=month;
		this.year=year;
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
public String toString() {
		
		return String.format("%s: %s\n%s: %s\n%s: %d/%d/%d\n%s: %d\n%s: %d\n%s: %d-%d ","Name",name,
				"Surname",surname,"Birthday",day,month,year,"Age",getAge(),"Max heart",maxHeartRate(),
				"Target heart rate range",targetLowHR(),targetHighHR());
		
	}

}
