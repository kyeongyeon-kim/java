import java.io.File;
import java.io.IOException;

public class Main4 {
	public static void main(String[] args) {
		File my = new File("d:\\myfolder\\new.txt");
//		System.out.println(my.exists());
		
		try {
			boolean result = my.createNewFile();
			if (result) {
				System.out.println("파일 생성 : 성공");
			}
			// 파일이 이미 존재할 때 false
			System.out.println("실패");
		} catch (IOException e) {
			System.out.println("입출력 예외가 발생하여 파일 생성에 실패했습니다.");
		}
	}
}
