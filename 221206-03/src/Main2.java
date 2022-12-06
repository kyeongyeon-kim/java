import java.util.HashMap;
import java.util.Map;

public class Main2 {
	public static void main(String[] args) {
		String line = "Hello. I'm a java developer";
		
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				int count = map.get(c);
				count++;
				map.put(c, count);
			}
			
		}
		System.out.println(map.toString());
	}
}
