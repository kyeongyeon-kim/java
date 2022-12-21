public class Test {
	public static void main(String[] args) {
		String str = "name,ggg,kkk,lll";
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
