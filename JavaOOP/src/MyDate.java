import java.util.Objects;

public class MyDate {
	private int day;
	private int month;
	private int year;
	// Contructor
	public MyDate(int d, int m, int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	public void printDay()
	{
		System.out.println(this.day);
	}
	public void printMonth()
	{
		System.out.println(this.month);
	}
	public void printYear()
	{
		System.out.println(this.year);
	}
	public void printDate()
	{
		System.out.println(this.day+"-"+this.month+"-"+this.year);
	}
	@Override
	public String toString() {
		return this.day+ "-"+this.month+"-"+this.year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
}

