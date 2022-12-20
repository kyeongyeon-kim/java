import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		// 파일 복사하기
		File origin = new File("D:\\myfolder\\4조 발표자료.pptx");
		File copy = new File("D:\\myfolder\\4조 발표자료 - copy.pptx");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(origin);
			fos = new FileOutputStream(copy);
			int b;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
