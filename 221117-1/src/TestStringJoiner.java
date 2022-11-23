import java.util.StringJoiner;

public class TestStringJoiner {
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		
		sj.add("A");
		sj.add("B");
		sj.add("C");
		sj.add("D");
		
		System.out.println(sj.toString());
	}

}
//week = 현재 달의 요일을 정수로 표현 (0 일요일 ~ 6 토요일)
		// cal 참조의 일자는 17번째 줄에서 1로 변경 됨
		
		// week -1 = 달력 첫 주의 공백 개수
		// count = 공백이 채워 질 때마다 체크하기 위한 정수

//날짜를 현재 달의 1일로 설정
//lastDay = 이번 달의 마지막 일자