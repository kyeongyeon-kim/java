
public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "둘리";
		st1.kr = 90;
		st1.eng = 80;
		st1.math = 100;
		
//		
//		st1.getSum();
//		st1.getAvg();
		
		System.out.println(st1.name + "학생의 성적 총합은 " + st1.getSum() + "점 입니다.");
		System.out.println(st1.name + "학생의 성적 평균은 " + st1.getAvg() + "점 입니다.");
		
		Student st2 = new Student();
		st2.name = "도우너";
		st2.kr = 70;
		st2.eng = 60;
		st2.math = 60;
		
		System.out.println(st2.name + "학생의 성적 총합은 " + st2.getSum() + "점 입니다.");
		System.out.println(st2.name + "학생의 성적 평균은 " + st2.getAvg() + "점 입니다.");
	}
}
