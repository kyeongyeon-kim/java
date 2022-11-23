import java.util.Scanner;

public class StudentManager2 {
	private Student student;
	private Student student2;
	private Student student3;
	
	public void start() {
		student = inputStudent();
		student2 = inputStudent();
		student3 = inputStudent();
		
		printResult(student);
		printResult(student2);
		printResult(student3);
	}
	
	private Student inputStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 이름? ");
		String name = scan.next();
		System.out.print(name + "의 국어점수? ");
		int kor = scan.nextInt();
		System.out.print(name + "의 영어점수? ");
		int eng = scan.nextInt();
		System.out.print(name + "의 수학점수? ");
		int math = scan.nextInt();
		
		Student student = new Student(name, kor, eng, math);
		return student;
	}
	
	private void printResult(Student student) {
		System.out.printf("%s의 점수는 다음입니다.\n", student.getName());
		System.out.println("총점 : " + student.getSum());
		System.out.println("평균 : " + student.getAvg());
	}
	
	public static void main(String[] args) {
		StudentManager2 s = new StudentManager2();
		s.start();
	}
}














