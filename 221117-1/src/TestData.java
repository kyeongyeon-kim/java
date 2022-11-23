import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestData {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // getInstance() static 메소드
//		System.out.println(cal.toString());
		// 2022 - 11 - 17
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		System.out.println("오늘 : " + dateFormat.format(cal.getTime()));
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println("오늘 : " + dateFormat2.format(cal.getTime()));
		
		dateFormat2.toString();
		System.out.println(cal.get(1));
		System.out.println(cal.get(2));
		System.out.println(cal.get(5));
		
//		cal.set(Calendar.YEAR, 2023);
//		cal.set(Calendar.MONTH, Calendar.MARCH);
//		cal.set(Calendar.DAY_OF_MONTH, 31);
		
		
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastday);
	}

}
