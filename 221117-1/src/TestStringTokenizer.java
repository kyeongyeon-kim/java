import java.util.StringTokenizer;

public class TestStringTokenizer {
	public static void main(String[] args) {
		String str = "동해물과 백두산이 마르고 닳도록";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		// Interation
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		
		}
		StringTokenizer st2 = new StringTokenizer("Hello, I'm a Developer. I love Java", ",. ", true);
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		
		}
	}
}
