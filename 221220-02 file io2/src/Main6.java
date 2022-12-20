import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main6 {
	public static void main(String[] args) {
		// D:\myfolder\names.txt에 기록되 있는 이름 정보를
		// 읽어
		// 몇 명의 이름이 기록되어 있는지?
		// 기록된 이름 중 2글자인 사람은 누구인지?
		
		File file = new File("D:\\myfolder\\names.txt");
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(file));
			// 한줄씩 읽기
			String line = br.readLine();
			StringTokenizer st = new StringTokenizer(line, " ");
			List<String> list = new ArrayList<>();
			
			while (st.hasMoreTokens()) {
				list.add(st.nextToken());
			}
			System.out.println("이름 개수 : " + list.size());
			
			for (String s : list) {
				if (s.length() == 2) {
					System.out.println(s);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
