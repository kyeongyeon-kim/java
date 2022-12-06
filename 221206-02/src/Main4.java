import java.util.Set;
import java.util.TreeSet;

public class Main4 {
	public static void main(String[] args) {
		// treeSet : 원소를 집어넣어주면 크기순으로 정렬해준다.
		Set<Integer> set = new TreeSet<>();
		set.add(100);
		set.add(90);
		set.add(60);
		set.add(40);
		set.add(70);
		set.add(90);
		set.add(100);
		
		System.out.println(set);
	}
}
