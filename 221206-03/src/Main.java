import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		// Map 은 dictionary
		// 짝을 이루는 자료를 여러개로 관리하고 있는 기능
		// 자료는 key와 value를 정의해야한다.
		// key는 중복되면 안된다. 간단하면 간단할수록 좋다.
		// key, value
		Map<Integer, String> player = new HashMap<>();
		player.put(1, "김승규");
		player.put(21, "조현우");
		player.put(5, "정우영");
		player.put(25, "정우영");
		
		System.out.println(player.size());
		
		// 맵에서 자료 꺼내는 법
		System.out.println(player.get(5));
		System.out.println(player.get(1));
		System.out.println(player.get(27));
		System.out.println(player.containsKey(27));

		// 주의 사항 : 키 값이 같다면 밸류값을 덮어씌워버림
		player.put(1, "새밸류");
		System.out.println(player.get(1));
		// map의 key는 set의 형태로 저장된다.
		Set<Integer> keys = player.keySet();
		Iterator<Integer> iter = keys.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			String value = player.get(key);
			
			System.out.println("키 : " + key + ", 밸류 : " + value);
		}
		// entrySet
		// <Integer, String>을 담고있는 <Entry>
		Set<Entry<Integer, String>> entrySet = player.entrySet();
		for (Entry<Integer, String> e : entrySet) {
			System.out.println(e.getKey() + " = " + e.getValue());
		}
	}
}
