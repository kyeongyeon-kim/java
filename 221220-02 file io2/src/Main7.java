import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main7 {
	public static void main(String[] args) {
		// 전화번호 기록
		List<String> phone = new ArrayList<>(Arrays.asList(
				"010-1111-1111"
				, "010-2222-2222"
				, "010-3333-3333"));
		
		
		File file = new File("D:\\myfolder\\phones.txt");
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(file));
			
			for (int i = 0; i < phone.size(); i++) {
				String elem = phone.get(i);
				bw.write(elem);
				bw.write("\n");
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
