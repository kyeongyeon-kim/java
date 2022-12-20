import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main9 {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\memos\\anotherfile.txt");
		//byte스트림이라고 부름
//		FileInputStream fis = null;
		//문자단위로 읽어주는 리더스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			
			int c;
			while((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
//			fis = new FileInputStream(file);
//			
//			int b;
//			while ((b = fis.read()) != -1) {
//				System.out.print((char) b);
//			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못 했습니다.");
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					System.out.println("입출력 예외 발생");
				}
			}
		}
	}
}
