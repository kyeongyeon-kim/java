public class TestPerson {
	public static void main(String[] args) {
		Pen pen = new Pen(2000);
		Person p = new Person("길동", 22, pen);
		pen.write("펜으로 글자쓰기");
		p.writeOwnName();
	}

}
