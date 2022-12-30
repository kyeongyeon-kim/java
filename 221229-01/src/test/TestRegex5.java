package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex5 {
	public static void main(String[] args) {
//		String line = "[name:parkmin, age:18], [name:dooli, age:22]";
//
//		Pattern p = Pattern.compile("\\[name:(\\w+), age:(\\d+)\\]");
//		Matcher m = p.matcher(line);
//
//		while (m.find()) {
//			// 패턴매칭한 값을 가져오는 법 (그룹)
//			System.out.println(m.group(1));
//			System.out.println(m.group(2));
//		}
		String email = "fgszhufdz@naver.cca";
		Pattern p = Pattern.compile("[a-z]{1,15}@[a-z.]{1,15}");
		Matcher m = p.matcher(email);
		System.out.println(m.matches());
//		String name = "김경연";
//		Pattern p = Pattern.compile("[a-zA-zㄱ-힣]{1,15}");
//		Matcher m = p.matcher(name);
//		System.out.println(m.matches());
	}
}
