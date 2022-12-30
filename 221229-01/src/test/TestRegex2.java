package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex2 {
	public static void main(String[] args) {
		String inputABC = "abcdef";
		String input123 = "123456";
		// Pattern은 하나의 문자에대해 범위를 지정해 줄 수 있다.[문자]{왼쪽범위문자의 길이} = 영소문자가 6개 있냐 ㅇㅇ true
		Pattern p = Pattern.compile("[a-f]{6}");
		Matcher m = p.matcher(inputABC);
		// matches = 완벽하게 동일한 값이면 true
		System.out.println(m.matches());
		// \\d = 숫자범위만 [0-9]
		Pattern patternNumbers = Pattern.compile("\\d{6}");
		Matcher matcherNumbers = patternNumbers.matcher(input123);
		System.out.println(matcherNumbers.matches());
		// \\w == [a-zA-Z0-9]
		// {최소만족하는 문자개수, 최대만족하는 문자개수} {0,} = 최소만족문자 0, 최대만족문자 무한대/ {1,15} = 최소만족문자 1 이상 , 최대만족문자 15 이하
		String line = "aasdf";
		Pattern pattern = Pattern.compile("\\w+");
		Matcher matcher = pattern.matcher(line);
		System.out.println(matcher.matches());
	}
}
