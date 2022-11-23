// 학생
// 이름
// 국어 점수
// 영어 점수
// 수학 점수

// 총점 구하기
// 평균 구하기
public class Student {
	String name;
	int kr;
	int eng;
	int math;
	
	// 반환되는 리턴값이 없어서 getSum을 사용 할 수 없음
//	void getSum( ) {
//		int sum = kr + eng + math;
//		System.out.println(name + "학생의 성적 총합은 " + sum + "점 입니다.");
//	}
//	void getAvg( ) {
//		int avg = getSum() / 3;
//		System.out.println(name + "학생의 성적 평균은 " + avg + "점 입니다.");
//	}
	
	int getSum() {
		return kr + eng + math;
	}
	double getAvg() {
		return getSum() / 3.0;
	}

}
