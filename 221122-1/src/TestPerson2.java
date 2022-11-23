
public class TestPerson2 {
	public static void main(String[] args) {
		Person[] persons = {
				new Person("둘리", 22, false)
				, null
				, new Person("길동", 44, true)
				, new Person("도우너", 33, false)
		};
		
		// 위 배열에서 null 참조를 하고 있는 index를 출력하기
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] == null) {
				System.out.println(i);
			}
		}
		
		
//		for (int i = 0; i < persons.length; i++) {
//			Person p = persons[i];
//			if (p != null) { // null 체크 !
//				System.out.println(persons[i].toString());
//			}
//			
//		}
	}
}
