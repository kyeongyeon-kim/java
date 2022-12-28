import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		RestaurantDB db = new RestaurantDB();
		int count = db.countAll();
		System.out.println(count);
//		int result = db.create("카오짜이", "000-444", "중앙대로756", 5.0);
		
//		int result1 = db.create(new Restaurant("마마된장", "924-4008", "서면로68", 5.0));
//		System.out.println(result1 + "행 추가");
//		
//		int result2 = db.delete(5);
//		System.out.println(result2 + "행 삭제");
//		
//		int result3 = db.update(3, "온센텐동", "333-1234", "서면로68번길", 4.7);
//		System.out.println(result3 + "행 수정");
//		
//		List<Restaurant> list1 = db.selectAll();
//		for (Restaurant r : list1) {
//			System.out.println(r);
//		}
//		List<Restaurant> list2 = db.selectRestaurantByName("영자면옥");
//		System.out.println(list2);
		
//		int result4 = db.countRestaurant();
//		System.out.println("등록 된 총 식당 개수 : " + result4);
		
//		List<Restaurant> result4 = db.selectByScoreRange(4,5);
//		System.out.println(result4);
//		List<Restaurant> list = new ArrayList<> (Arrays.asList(
//				new Restaurant("보소보소", "456-7777", "부전동 999-4", 3.5)
//				, new Restaurant("버거킹", "666-6666", "부전동 111-4", 2.5)
//				));
//		int result5 = db.createValues(list);
//		System.out.println(result5 + "행 추가되었습니다.");
	}
}
