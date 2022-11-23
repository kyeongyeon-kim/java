// 비행기
// 최대승객수
// 모델명

// 현재 까지 생성된 비행기(인스턴스) 개수

public class Plane {
	private int maxPassenger;
	private String model;
	
	private static int count;

	public Plane(int maxPassenger, String model) {
		this.maxPassenger = maxPassenger;
		this.model = model;
		count++;
		
		System.out.println("현재까지의 비행기 생성 수 : " + count);
	}
	
	public static int getCount() {
		return count;
	}
}
