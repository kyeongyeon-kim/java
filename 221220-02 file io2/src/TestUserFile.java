import java.util.LinkedHashMap;
import java.util.Map;

public class TestUserFile {
	public static void main(String[] args) {
		UserFileRepository repo = new UserFileRepository();
		
		Map<String, String> testMap = new LinkedHashMap<>();	
		testMap.put("테스트용이름", "테스트용전화번호");
		testMap.put("다음사람이름", "다음사람전화번호");
		
//		repo.writeUser(testMap);
//		
//		System.out.println("기록된 텍스트파일을 확인해보세요.");
		
		Map<String, String> readMap = repo.readUser();
		System.out.println(testMap.equals(readMap));
	}
}
