package test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex4 {
	public static void main(String[] args) {
		// 전화번호 형식 : 010-####-##### (#은 숫자)
		Scanner scan = new Scanner(System.in);
//		System.out.println("전화번호 입력");
//		String phone = scan.next();
//		
//		Pattern p = Pattern.compile("010-[0-9]{4}-[0-9]{4}");
//		Matcher m = p.matcher(phone);
//		System.out.println(m.matches());
		
		// 사용자 아이디를 입력받아 유효한지 확인
		// 아이디 형식 : 영소문자로 시작하며, 영문자 또는 숫자로 이루어져야한다.
		// 1. 영소문자로 시작하며
		// 2. 영소/대문자 또는 숫자로 이루어져야한다.
		// 3. 길이값은 최소3, 최대:15
		System.out.println("id 입력");
		String id = scan.next();
		//[a-z] == 문자 하나를 의미  (구) [a-z]{1}[\\w]{2,14}
		Pattern p2 = Pattern.compile("[a-z]\\w{2,14}");
		Matcher m2 = p2.matcher(id);
		System.out.println(m2.matches());
		
		// 사용자 비밀번호를 입력받아 유효한지 확인
		// 비밀번호 형식, 특수문자를 포함한 최소 : 8, 최대: 20자리 문자열
		System.out.println("pw 입력");
		String pw = scan.next();
		
		Pattern p3 = Pattern.compile("[\\w~!@#$%^&*()]{8,20}");
		Matcher m3 = p3.matcher(pw);
		System.out.println(m3.matches());
	}
}
