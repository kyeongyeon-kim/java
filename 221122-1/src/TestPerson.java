public class TestPerson {
	public static void main(String[] args) {
		Person[] persons = {
				new Person("둘리", 22, false)
				, new Person("길동", 44, true)
				, new Person("도우너", 33, false)
		};
		
		for (int i = 0; i < persons.length; i++) {
			Person p = persons[i];
			if (!p.isMarry()) {
				p.setPen(new Pen(1000));
			}
		}
		
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
		
		// 기혼자
//		for (int i = 0; i < persons.length; i++) {
//			if (persons[i].isMarry() == true) {
//				System.out.println(persons[i]);
//			}
//		}
//		for (int i = 0; i < persons.length; i++) {
//			Person p = persons[i];
//			if (p.isMarry()) {
//				System.out.println(p.toString());
//			}
//		}
		
		// 미혼자들의 평균 나이
//		int count = 0;
//		int sum = 0;
//		for (int i = 0; i < persons.length; i++) {
//			Person p = persons[i];
//			if (!p.isMarry()) {
//				count++;
//				sum += p.getAge();
//			}
//		}
//		System.out.println(sum / count);
	}

}
