import java.util.Scanner;

// 학생 관리 프로그램
// 3명의 학생의 점수를 관리하는 프로그램입니다.

// 콘솔 입/출력을 통해
// 각 학생의 이름과 점수를 입력받고
// 3명의 총합, 평균을 콘솔 출력으로 볼 수 있는 프로그램

// 추가 기능
// 전체 학생의 목록 보기 (각 학생의 이름과 점수 보기)

// 기능 변경
// 각 학생의 점수는 국,영,수 점수로 관리되어야 합니다.

// 1. 학생을 클래스로 만들어보고 싶어요.
public class StudentManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 이름? ");
		String name = scan.next();
		System.out.print(name + "의 국어점수? ");
		int scoreKor = scan.nextInt();
		System.out.print(name + "의 영어점수? ");
		int scoreEng = scan.nextInt();
		System.out.print(name + "의 수학점수? ");
		int scoreMath = scan.nextInt();
		Student s = new Student(name, scoreKor, scoreEng, scoreMath);
				
		System.out.print("학생 이름? ");
		name = scan.next();
		System.out.print(name + "의 국어점수? ");
		scoreKor = scan.nextInt();
		System.out.print(name + "의 영어점수? ");
		scoreEng = scan.nextInt();
		System.out.print(name + "의 수학점수? ");
		scoreMath = scan.nextInt();
		Student s2 = new Student(name, scoreKor, scoreEng, scoreMath);
		
		System.out.print("학생 이름? ");
		name = scan.next();
		System.out.print(name + "의 국어점수? ");
		scoreKor = scan.nextInt();
		System.out.print(name + "의 영어점수? ");
		scoreEng = scan.nextInt();
		System.out.print(name + "의 수학점수? ");
		scoreMath = scan.nextInt();
		Student s3 = new Student(name, scoreKor, scoreEng, scoreMath);
		
		int sum = s.getSum() + s2.getSum() + s3.getSum();
		int avg = (s.getAvg() + s2.getAvg() + s3.getAvg()) / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.printf("%s의 점수는 %d입니다.\n", s.getName(), s.getSum());
		System.out.printf("%s의 점수는 %d입니다.\n", s2.getName(), s2.getSum());
		System.out.printf("%s의 점수는 %d입니다.\n", s3.getName(), s3.getSum());
	}
}





