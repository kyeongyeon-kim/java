import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main8 {
	public static void main(String[] args) {
		// 입력스트림
		File memo = new File("d:\\myfolder\\memos\\todaymemo.txt");
		// null로 초기화 후 사용
		FileInputStream fis = null;
		try {
			// FileInputStream == 택배회사
			fis = new FileInputStream(memo);
			// 파일 읽을거임
			// 모든 자료는 숫자로 저장된다. a == (char) 97
			int b;
			while ((b = fis.read()) != -1) {
				System.out.print((char) b);
			}
			
			// catch는 자식이 제일 위에 ~ 부모가 제일 밑
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException e) {
			System.out.println("입출력 예외가 발생했습니다.");
		} finally {
			// 인풋스트림을 닫아야함.
			// null값이 그대로 옮겨 올 수 있기에 null체크
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("인풋스트림을 닫는 동안 입출력예외가 발생했습니다.");
				}
			}
		}
	}
}
