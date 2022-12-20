import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main10 {
	public static void main(String[] args) {
		File file = new File("D:\\myfolder\\memos\\output.txt");
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			// 출력시 기존내용은 무시한채 새로 출력한다.
			String line = "write practice.";
			byte[] bytes = line.getBytes();
			
			fos.write(bytes);
		} catch (IOException e) {
			System.out.println("입출력 예외 발생");
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					System.out.println("입출력 예외 발생");
				}
			}
		}
	}
}
