public class TestFactory {
	public static void main(String[] args) {
		DollFactory fac = new DollFactory();
		Doll d1 = fac.produceDoll(1);
		Doll d2 = fac.produceDoll(2);
		Doll d3 = fac.produceDoll(3);
		Doll d4 = fac.produceDoll(4);
		
		if (d4 != null) { // null체크 null참조가 반환되지 않으면 좋지만 반환되면 null체크가 필요함.
			System.out.println(d4.getPrice());	
		}
		
		// null값이 출력되면 프로그램이 정상종료 되지않고 null 시점에서 강제종료 됨.
	}
}
