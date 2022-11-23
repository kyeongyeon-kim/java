
public class TestCar {
	public static void main(String[] args) {
		Car car1 = new Car("Red", 100);
		Car car2 = new Car("Blue", 900);
		
		Car[] arr = new Car[2];
		arr[0] = car1;
		arr[1] = car2;
		
//		System.out.println(arr[0].toString());
//		System.out.println(arr[1].toString());
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}

}
