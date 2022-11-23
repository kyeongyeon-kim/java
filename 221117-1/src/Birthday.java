import java.util.Calendar;
import java.util.GregorianCalendar;

public class Birthday {
	public static void main(String[] args) {
//		Calendar today = new GregorianCalendar();
		// 기본 생성자는 현재 날짜와 시간
		// Calendar 클래스의 1월은 정수 0이기에 원하는 월에서 -1을 해줘야함
		Calendar today = new GregorianCalendar(2022, 10, 18);
		Calendar dDay = new GregorianCalendar(2023, 1, 17);
		
		
		long diffSec = (dDay.getTimeInMillis() - today.getTimeInMillis()) / 1000;
		// 1000분의 1초로 값을 반환받기때문에 /1000을 해줌
		long diffDays = diffSec / (24 * 60 * 60);
		// 초단위로 만든 값을 일단위로
		System.out.println("두 날짜간의 일수 차 : " + diffDays + "일");
	}
}
