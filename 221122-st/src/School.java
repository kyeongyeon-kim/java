import java.util.Arrays;

public class School {
	protected Class[] classes;
	
	public School(int ClassesNum) {
		Class[] arr = new Class[ClassesNum];
		this.classes = arr;
		for (int i = 0; i < ClassesNum; i++) {
			System.out.println((i + 1) + "반의 학생 수를 입력하세요.");
			Student[] arr2 = new Student[scan.nextInt()];
			this.students = arr2;
		}
	}

	public Class[] getClasses() {
		return classes;
	}

	public void setClasses(Class[] classes) {
		classes = classes;
	}

	@Override
	public String toString() {
		return "School [Classes=" + Arrays.toString(classes) + "]";
	}
	public void setStArr() {
		for (int i = 0; i < classes.length; i++) {
			for (int j = 0; j < students.length; j++) {
				String stName;
				String stGender;
				int score = 0;
				System.out.println((i + 1)+ "반 " + (j + 1) + "번 학생 이름을 입력하세요.");
				stName = scan.next();
				System.out.println((i + 1)+ "반 " + (j + 1) + "번 학생 성별(남, 여)를 입력하세요.");
				stGender = scan.next();
				if (stGender.equals("남") == false && stGender.equals("여") == false) {
					j--;
					System.out.println("올바른 값을 입력하세요.");
					continue;
				}
				System.out.println((i + 1)+ "반 " + (j + 1) + "번 학생 점수를 입력하세요.");
				score = scan.nextInt();
				if (!(score >= 0 && score <= 100)) {
					j--;
					System.out.println("0 ~ 100사이 정수를 입력하세요.");
					continue;
				}
				this.classes[i].students[j] = new Student(stName, stGender, score);
			}
			
		}
		
	}
	public void showArr() {
		for (int j = 0; j < classes.length; j++) {
			System.out.printf("<%d반>\n", (j + 1));
			for (int i = 0; i < students.length; i++) {
				System.out.println(students[i]);
			}
		}
			
	}
}
