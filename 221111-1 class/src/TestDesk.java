
public class TestDesk {

	public static void main(String[] args) {
		Desk d1 = new Desk();
		Desk d2 = new Desk();
		
		System.out.println(d1.color);
		System.out.println(d1.height);
		System.out.println(d1.weight);
		
		System.out.println(d2.color);
		System.out.println(d2.height);
		System.out.println(d2.weight);
		
		d2.color = "red";
		System.out.println(d1.color);
		System.out.println(d2.color);
	}

}
