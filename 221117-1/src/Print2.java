import java.text.SimpleDateFormat;
import java.util.Calendar;

// 2022-11-17 목
// 일    월    화    수    목    금    토
//       01  02 03 04  05
public class Print2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E");
		
		System.out.println(dateFormat.format(cal.getTime()));
		
		cal.set(Calendar.MONTH, Calendar.DECEMBER);
		
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// lastDay = 이번 달의 마지막 일자
		cal.set(Calendar.DAY_OF_MONTH,1);
		// 날짜를 현재 달의 1일로 설정
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// week = 현재 달의 요일을 정수로 표현 (0 일요일 ~ 6 토요일)
		System.out.println("일   월   화   수   목   금   토");
		
		int count = 0;
		boolean onOff = true;
		// week -1 = 달력 첫 주의 공백 개수
		// count = 공백이 채워 질 때마다 체크하기 위한 정수
		
		while (onOff) {
			if (week - 1 == 0) {
				break;
			}
			System.out.print("   ");
			count++;
			if (week - 1 == count) {
				onOff = false;
			}
		}
		for (int i = 1; i <= lastDay; i++) {
			System.out.printf("%02d ", i);
			if (week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
	}
}
