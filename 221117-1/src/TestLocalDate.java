import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today.toString());
		System.out.println(today.getYear());
		System.out.println(today.getMonth().getValue());
		System.out.println(today.getDayOfMonth());
		
		LocalDate someday = LocalDate.of(2023,3,12);
		LocalDate parsing = LocalDate.parse("2011-03-07");
		
		
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(tomorrow.getDayOfWeek());
		int lastDay = today.lengthOfMonth();
		System.out.println("마지막 : " + lastDay);
	}

}
