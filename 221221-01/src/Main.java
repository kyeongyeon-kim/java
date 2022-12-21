import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		// 생성자에서 true 값을 추가하면 기존파일내용을 무시하는 것이 아닌 기존 정보 끝에 새로운 정보가 추가 된다.
		// try resource문 에서 사용한 스트림을 사용한 후 자동으로 닫아준다. ( try (close자동으로 호출)) {}
		try (FileWriter fw = new FileWriter(new File("d:\\myfolder\\test1.txt"), true);){
			fw.write("문자열");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}