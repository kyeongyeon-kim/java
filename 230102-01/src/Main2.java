import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {
	public static void main(String[] args) {
		// 기존 파일 불러오는 법
		// File file = new File("파일경로");
		// 자바 1.7버전 이후부터 가능한 더 최신(대응되는) 방법
		Path path = Paths.get("D:\\kimkyeongyeon\\춘식\\춘식6.png"); //경로를 나타내는 다른방법 : "D:\\kimkyeongyeon\\춘식", "춘식6.png"
		try {
			Files.copy(path, Paths.get("D:\\myfolder\\복사본.png"));
			System.out.println("파일 복사 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
