
public class TestCup {

	public static void main(String[] args) {
		Cup cup = new Cup();
		cup.volume = 30;
		
		cup.pour();
		cup.pour();
		cup.pour();
		int result = cup.pour();
		System.out.println(result);
	}

}
