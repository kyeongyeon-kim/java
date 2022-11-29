import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Customer implements Comparable<Customer>{
	Scanner scan = new Scanner(System.in);
	private String name;
	private String phoneNum;
	private Date checkIn;
	private Date checkOut;

	

	@Override
	public int compareTo(Customer o) {
		if(this.checkIn.getYear() <= o.checkOut.getYear()) {
			if(this.checkIn.getMonth() <= o.checkOut.getMonth()) {
				if(this.checkIn.getDay() <= o.checkOut.getDay()) {
					return 1;
				}
			}
		} 
		return -1;
	}

	public Customer() {
		
	}
	
	public Customer(String name, String phoneNum, Date checkIn, Date checkOut) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Customer(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Customer(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}


	@Override
	public String toString() {
		return "예약자명 : " + name + " 전화번호 : " + phoneNum + " 체크인 : " + checkIn + " 체크아웃 : " + checkOut;
	}
	
	public Date checkIn() {
		System.out.println("체크인을 원하는 년/월/일을 순서대로 입력해주세요.");
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		return new Date(year, month, day);
	}
	
	public Date checkOut() {
		System.out.println("체크아웃을 원하는 년/월/일을 순서대로 입력해주세요.");
		int year2 = scan.nextInt();
		int month2 = scan.nextInt();
		int day2 = scan.nextInt();
		return new Date(year2, month2, day2);
	}
	
	public long howManyDays() {
		Calendar in = new GregorianCalendar(checkIn.getYear(), checkIn.getMonth() - 1, checkIn.getDay());
		Calendar out = new GregorianCalendar(checkOut.getYear(), checkOut.getMonth() - 1, checkOut.getDay());
		long diffSec = (out.getTimeInMillis() - in.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24 * 60 * 60);
		System.out.printf("체크인 : %d/%d/%d\n", checkIn.getYear(), checkIn.getMonth(),checkIn.getDay());
	System.out.printf("체크아웃 : %d/%d/%d\n", checkOut.getYear(), checkOut.getMonth(), checkOut.getDay());
	System.out.printf("총 %d박%d일 일정\n", diffDays, diffDays + 1);
		return diffDays + 1;
	}
}