
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class UserFileRepository {
	private final File file = new File("d:\\myfolder\\user.txt");
	
	public void writeUser(Map<String, String> map) {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(file));
			
			for (Entry<String, String> e : map.entrySet()) {
				bw.write(e.getKey() + " " + e.getValue() + "\n");
			}
			bw.flush();
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
	
	public Map<String, String> readUser() {
		BufferedReader br = null;
		Map<String, String> map = new LinkedHashMap<>();
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while ( (line = br.readLine()) != null ) {
				StringTokenizer st = new StringTokenizer(line, " ");
				String name = st.nextToken();
				String phone = st.nextToken();
				map.put(name, phone);
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
		return map;
	}
}


















