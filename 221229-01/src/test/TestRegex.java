package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
	public static void main(String[] args) {
		String line = "Hi. this is a book.";
		
		// 정규표현식 : regex(Regular expression)
		// Pattern 객체 = 식
		Pattern p = Pattern.compile("is");
		// Macher 객체 = 유효성 검사
		Matcher m = p.matcher(line);
		
		// find = 찾아봐라~ 있으면 true 없으면 false
		while (m.find()) {
			System.out.println("있음");
			System.out.println(m.start());
			System.out.println(m.end());
		}
	}
}
