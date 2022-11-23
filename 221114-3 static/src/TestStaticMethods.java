
public class TestStaticMethods {
	public static void main(String[] args) {
		int sum = Calculator.sum(78, 66);
		System.out.println(sum);
		
		System.out.println(Math.PI);
		
		int abs = Math.abs(10);
		System.out.println(Math.floor(3.5));
		System.out.println(Math.ceil(3.5));
		System.out.println(Math.round(3.5));
		
		
		System.out.println(Math.max(Math.max(100, 200), 300));
		
		double random = Math.random();
		System.out.println("임의 실수 : " + random);
		
		// 1 ~ 6;
		int dice = (int)(random * 6 + 1);
		System.out.println(dice);
		
		
		double pow = Math.pow(2, 4);
		System.out.println("2의 4제곱 = " + pow);
		
		
		
	}
}
