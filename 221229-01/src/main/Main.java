package main;
import java.util.Scanner;

import exception.DataIOException;
import exception.InputNotValidException;
import user.UserinfoRepositoryImpl;
import user.UserinfoService;
import user.UserinfoServiceImpl;

// 간단한 콘솔 입력

// 1. 회원가입
// email 서식
// @가 하나는 포함되어있어야함
// @앞은 영소문자로만 이루어진 1~15자 문자열
// @뒤는 영소문자로 및 . 을 포함한 1~15자 문자열

// 이름, 성 서식
// 영소/대문자 및 한글로 표현된 1~15자 문자열

// 2. 회원탈퇴
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// JDBC에 연결하기위한 단계로 필요한 라이브러리가 있다면 이 또한 의존성으로 볼 수 있다.
		// 메인메소드에서 Service를 구현한 클래스로 객체를 만들게 되면 어떤점이 불리한지 O
		// UserinfoServiceImpl만이 갖고 있는 고유한 메소드가 있는데 인터페이스형으로 만들게되면 고유한 메소드는 객체를 통해 접근 할 수 없게 된다.
		// 인터페이스형으로 만들게 되면 가시성이 좋아지는 장점이 있음
		UserinfoService service = new UserinfoServiceImpl(new UserinfoRepositoryImpl());
		
		// 인터페이스를 필드로 선언
		// 분리한 이유 : 각 각의 인터페이스가 해야할 일이 다르다고 생각해서, 해당 클래스에 과중한 책임을 덜 주게끔 만들기 위해
		
		System.out.println("1. 회원가입 / 2. 회원탈퇴");
		int input = scan.nextInt();
		scan.nextLine();
		
		if (input == 1) {
			System.out.println("이메일, 이름, 성 입력");
			String email = scan.nextLine();
			String firstname = scan.nextLine();
			String lastname = scan.nextLine();
			
			try {
				int result = service.userin(email, firstname, lastname);
				if (result > 0) {
					System.out.println("회원가입 성공. 당신의 아이디는 " + result);
				}
			} catch (InputNotValidException e) {
				System.out.println(e.getMessage());
			} catch (DataIOException e) {
				// Throwable = 예외 객체 자체 원인을 담고 있음
				Throwable t = e.getCause();
				System.out.println(t.getMessage());
				System.out.println("시스템 장애가 발생했습니다. 나중에 다시 시도해주세요.");
			}
//			System.out.println("입력값 확인 : " + email + ", " + firstname + ", " + lastname);
		} else if (input == 2) {
			System.out.println("아이디 번호 입력");
			int id = scan.nextInt();
			
			int result = service.userout(id);
			
			System.out.println(result == 1? "삭제됨" : "삭제안됨");
		}
	}
}
