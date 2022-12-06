import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Main5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<Character, String> map = new HashMap<>();
		String word = scan.next();
		String upper = word.toUpperCase();
	      map.put('A', "ㆍ－");
	      map.put('B', "－ㆍㆍㆍ");
	      map.put('C', "－ㆍ－ㆍ");
	      map.put('D', "－ㆍㆍ");
	      map.put('E', "ㆍ");
	      map.put('F', "ㆍㆍ－ㆍ");
	      map.put('G', "－－ㆍ");
	      map.put('H', "ㆍㆍㆍㆍ");
	      map.put('I', "ㆍㆍ");
	      map.put('J', "ㆍ－－－");
	      map.put('K', "－ㆍ－");
	      map.put('L', "ㆍ－ㆍㆍ");
	      map.put('M', "－－");
	      map.put('N', "－ㆍ");
	      map.put('O', "－－－");
	      map.put('P', "ㆍ－－ㆍ");
	      map.put('Q', "－－ㆍ－ ");
	      map.put('R', "ㆍ－ㆍ ");
	      map.put('S', "ㆍㆍㆍ");
	      map.put('T', "－ ");
	      map.put('U', "ㆍㆍ－");
	      map.put('V', "ㆍㆍㆍ－");
	      map.put('W', "ㆍ－－ ");
	      map.put('X', "－ㆍㆍ－ ");
	      map.put('Y', "－ㆍ－－ ");
	      map.put('Z', "－－ㆍㆍ");
	      for (int i = 0; i < upper.length(); i++) {
	    	  char c = upper.charAt(i);
	    	  System.out.println(map.get(c));
	      }
	}
}
