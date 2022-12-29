import java.util.Scanner;

// 간단한 콘솔 입력

// 1. 회원가입

// 2. 회원탈퇴
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		UserInfoService service = new UserinfoServiceImpl(new UserinfoRepo());
		
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
				System.out.println(result);
				if (result > 0) {
					System.out.println("회원가입 성공");
				}
			} catch (InputNotValidException e) {
				System.out.println(e.getMessage());
			}
			
//			System.out.println("입력값 확인 : " + email + ", " + firstname + ", " + lastname);
		} else if (input == 2) {
			System.out.println("아이디 번호 입력");
			int id = scan.nextInt();
			
			System.out.println("입력값 확인 : " + id);
		}
	}
}
