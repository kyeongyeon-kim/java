import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main3 {
	public static void main(String[] args) throws IOException {
		List<String> fileContent
		= Files.readAllLines(Paths.get("텍스트파일경로")); // 모든 텍스트를 읽어, 각 행을 List의 원소로 반환
		
//		Files.readAllBytes(path) byte[]로 파일 내용 모두 읽어옴. 
		
//		Files.write(Paths.get("출력경로"), fileContent); // list의 String을 각 행으로 출력해줌.
		Files.write(Paths.get(".\\텍스트출력.txt"), Arrays.asList("문자열 1행", "문자열 2행", "문자열 3행"));
//		Files.write(경로, 바이트배열); 해당 경로에 byte[] 모든 내용 출력
		
	
	}
}
