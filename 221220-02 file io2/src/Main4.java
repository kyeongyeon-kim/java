import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		// 파일 복사하기
		File origin = new File("D:\\myfolder\\4조 발표자료.pptx");
		File copy = new File("D:\\myfolder\\4조 발표자료 - copy.pptx");
		
		BufferedInputStream fis = null;
		BufferedOutputStream fos = null;
		
		try {
			fis = new BufferedInputStream(new FileInputStream(origin));
			fos = new BufferedOutputStream(new FileOutputStream(copy));
//			int b;
//				while((b = fis.read()) != -1) {
//					fos.write(b);
//				}
			byte[] buf = new byte[1024];
			int length = 0;
			while ((length = fis.read(buf)) != -1) {
				fos.write(buf, 0, length);
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
