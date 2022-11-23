// 사자(3), 호랑이(4), 표범(5). 세 동물의 사육사가 "길동"

// 동물
// 사육사
// 종
// 나이
            //(단방향 참조, 양방향 참조 둘 다 일어 날 수 있음)
// 사육사
// 동물
// 동물
// 동물
// 이름

public class TestZoo {
	public static void main(String[] args) {
		Zookeeper zk = new Zookeeper("길동");
		
		Animal lion = new Animal("사자", 3, zk);
		Animal tiger = new Animal("호랑이", 4, zk);
		Animal leopard = new Animal("표범", 5, zk);
		Animal elephant = new Animal("코끼리", 1, new Zookeeper("둘리"));
		Animal zebra = new Animal("얼룩말", 3, elephant.getZooKeeper());
		
		System.out.println(lion.getType());
		System.out.println(lion.getAge());
		System.out.println(lion.getZooKeeper().getName());
		
		System.out.println(tiger.getType());
		System.out.println(tiger.getAge());
		System.out.println(tiger.getZooKeeper().getName());
		
		System.out.println(zebra.getType());
		System.out.println(zebra.getAge());
		System.out.println(zebra.getZooKeeper().getName());
		
		
		
		
		
	}
}
