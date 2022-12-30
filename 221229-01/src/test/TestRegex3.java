package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex3 {
	public static void main(String[] args) {
		// 사용자에게 문자열을 입력받아 영대/소문자, 한글로 이루어진 1~10문자열인 경우 true 출력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열 입력");
		String str = scan.next();
		
		Pattern p = Pattern.compile("[a-zA-Zㄱ-힣]{5,10}");
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
	}
}
