import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
	public static void main(String[] args) {
		IRestaurantDB db = new RestaurantDBImpl();
		List<Restaurant> list = new ArrayList<> (Arrays.asList(
				new Restaurant("보소보소", "456-7777", "부전동 999-4", 3.5) 
				, new Restaurant(null, null, "부전동 111-4", 1.0)
				, new Restaurant("이름이너무길어서15자제한으로안됩니다아아아아아", null, "부전동 111-4", 1.0)
				, new Restaurant("버거킹", "666-6666", "부전동 111-4", 2.5)
			));
		int[] result = db.createList(list);
		System.out.println(Arrays.toString(result));
		
//		List<Restaurant> list = db.selectByName("영자면옥");
//		for (Restaurant r : list) {
//			System.out.println(r);
//		}
		
//		List<Restaurant> list = db.selectAll();
//		for (Restaurant r : list) {
//			System.out.println(r);
//		}
		
//		int result = db.update(16, "뉘집갈비탕", "123-7894", "부전동334", 4.9);
//		System.out.println(result);
		
//		int result = db.delete(17);
//		System.out.println(result);
		
//		int result = db.create("그집갈비탕", "456-1234", "부전동3333", 5.0);
//		System.out.println(result);
	}
}
