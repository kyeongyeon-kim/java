import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.JFrame;

// 중국집

// 짜장면 : 6000
// 짬뽕 : 7000
// 볶음밥 : 6500

// 주문
// 짜장면 1개
// 짬뽕 2개
// 볶음밥 3개

// 총 가격 출력
//class chineseFood extends JFrame {
//	
//}

public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> menu = new HashMap<>();
		menu.put("짜장면", 6000);
		menu.put("짬뽕", 7000);
		menu.put("볶음밥", 6500);
		Set<Entry<String, Integer>> menuSet = menu.entrySet();
		for (Entry<String, Integer> entry : menuSet) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		Map<String, Integer> order = new HashMap<>();
		Iterator<String> iter = menu.keySet().iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name + "개수 ?");
			int count = scan.nextInt();
			
			order.put(name, count);
		}
		
		int sum = 0;
		for (Entry<String, Integer> e : order.entrySet()) {
			sum += menu.get(e.getKey()) * e.getValue();
		}
		
		System.out.println(sum);
	}
}
