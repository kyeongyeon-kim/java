class Student { // 학생은 사람이라서 사람의 필드를 모두 갖는다. (학생클래스의 부모는 펄슨클래스)
	// 점수
	int score;
	Person person;
	// 이렇게하면 인스턴스가 2개가 생성됨 (변수 선언 : 학생이 사람을 갖고 있다, 상속 : 학생은 사람이다. 차이)
	public Student (String name, int age, int score) {
//		super(name, age);
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + "]";
	}
	
	
//	public Student() {
//		super(); //super == 부모생성자 호출, 기본생성자에 생략되어있음.
//		System.out.println("자식의 생성자 호출");
//	}
}