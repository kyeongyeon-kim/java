import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		// 여러 사람의 이름을 콘솔 입력받을 수 있는 프로그램
		// 0을 입력하면 모든 사람의 이름을 콘솔 출력 후 종료
		
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<>();

		while (true) {
			String input = scan.next();
			if (input.equals("0")) {
				break;
			}
			
			names.add(input);
		}
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("D:\\myfolder\\names.txt"));
			
			Iterator<String> iter = names.iterator();
			while (iter.hasNext()) {
				String elem = iter.next();
				
				bw.write(elem);
				bw.write("  ");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
