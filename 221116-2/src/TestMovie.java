public class TestMovie {
	public static void main(String[] args) {
		Movie m = new Movie("신과함께", 3.7, "김용화", 2017);
		System.out.println(m.toString());
		
		Movie m2 = new Movie("", 3.7, "김용화", 2017);
	}

}
