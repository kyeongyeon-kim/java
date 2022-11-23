import java.util.Arrays;

public class Main5 {
	public static void main(String[] args) {
		int[][] test = {  { 12, 33, 34 }
						, { 43, 11, 45 }
						, { 29, 34, 14 } };
		for (int i = 0; i < test.length; i++) {
			System.out.println(Arrays.toString(test[i]));
		}
		
		System.out.println(Arrays.deepToString(test));
		
	}

}
