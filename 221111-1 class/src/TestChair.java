
public class TestChair {

	public static void main(String[] args) {
		Chair c1 = new Chair("chair", "ch1", 200000, true);
		System.out.println(c1.getManufacturer());
		System.out.println(c1.getModelName());
		System.out.println(c1.getPrice());
		System.out.println(c1.isUpAndDown());
		
	}

}
