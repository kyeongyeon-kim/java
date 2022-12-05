import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Collection 배열을 쉽게 다루기위한 도구
		// List == 인터페이스, ArrayList == Class
		// ArrayList 배열처럼 사용이 가능함 / 길이값 설정할 필요 X 길이가 유동적으로 바뀜
		List list = new ArrayList();
		// add 메소드는 객체의 형태로 집어넣어야하기에, 기본형을 박싱하여 넣어야한다.
		list.add("asdf");
		list.add(Integer.valueOf(100));
		// auto박싱이 일어나기에 기본형을 넣으면 자동으로 박싱된다.
		list.add(500);
		list.add(Double.valueOf(45.12));
		
		// 리스트야 원소 몇 개니
		System.out.println("현재원소개수 :" + list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	
	}
}
