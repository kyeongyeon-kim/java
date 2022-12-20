import java.io.File;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		File f = new File("d:\\myfolder\\..");
		File f2 = new File("d:\\");
		// "\\" 최상위 루트 경로를 표현
		File f3 = new File("\\");
		
		System.out.println(f3.getAbsolutePath());
		
//		try {
//			System.out.println(f.getCanonicalPath().equals(f2.getCanonicalPath()));
//		} catch (IOException e) {
//			System.out.println("입출력 예외 발생");
//		}
		
		
		// getParent == 상위폴더를 구해줌
//		System.out.println("f의 상위 경로 문자열 : " + f.getParent());
//		System.out.println(new File(f.getParent()).equals(f2));
		
	}
}
