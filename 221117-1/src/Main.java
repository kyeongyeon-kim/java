import java.util.StringJoiner;

public class Main {
	public static void main(String[] args) {
		// 문자열 만들어주는 객체
		StringBuilder sb = new StringBuilder(); // java.lang 패키지는 굳이 import 하지 않아도 됨(자주 사용하는 패키지이기에 lang이)
		StringJoiner sj = new StringJoiner(", ", "[", "]");
		
		sb.append("문자열을 추가합니다.");
		sb.append(1000);
		sb.append(true);
//		sb.delete(0, 3);
//		sb.insert(0, "추가");
//		sb.setCharAt(0, 'T');
//		
		String result = sb.toString();   // 문자 자체를 여러개로 다룸
		System.out.println(result);
		
		
	}
}
