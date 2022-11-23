public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(int year, int month, int day) {
		setYear(year);
		setYear(month);
		setYear(day);
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year < 1900) {
			this.year = 1900;
		} else {
			this.year = year;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1) {
			this.month = 1;
		} else if (month > 12) {
			this.month = 12;
		} else {
			this.month = month;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day < 1) {
			this.day = 1;
		} else if (day > 31) {
			this.day = 31; //달의 최대 일 수를 구하는 메소드를 
		} else {
			this.day = day;
		}
	}
	
	public void print1() {
		System.out.printf("%d.%d.%d\n", year, month, day);
	}
	public void print2() {
		switch(month) {
		case 1:
			System.out.println("January" + " " + day + ", " + year);
			break;
		case 2:
			System.out.println("February" + " " + day + ", " + year);
			break;
		case 3:
			System.out.println("March" + " " + day + ", " + year);
			break;
		case 4:
			System.out.println("April" + " " + day + ", " + year);
			break;
		case 5:
			System.out.println("May" + " " + day + ", " + year);
			break;
		case 6:
			System.out.println("June" + " " + day + ", " + year);
			break;
		case 7:
			System.out.println("July" + " " + day + ", " + year);
			break;
		case 8:
			System.out.println("August" + " " + day + ", " + year);
			break;
		case 9:
			System.out.println("September" + " " + day + ", " + year);
			break;
		case 10:
			System.out.println("Octover" + " " + day + ", " + year);
			break;
		case 11:
			System.out.println("November" + " " + day + ", " + year);
			break;
		case 12:
			System.out.println("December" + " " + day + ", " + year);
			break;
		default :
			break;
		}
	}
}
