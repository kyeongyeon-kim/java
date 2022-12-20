import java.io.File;
import java.io.IOException;

public class Main2 {
	public static void main(String[] args) {
		// 상대적인 경로
		// "." == 현재경로를 뜻함 ( workspace의 프로젝트 경로) == D:\kimkyeongyeon\workspace\221220-01 file io\.
		// ".." == 현재경로의 상위경로 
		// "..\\.." == 현재경로의 상위경로의 상위경로
		File file = new File("..\\..");
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.exists());
		// 절대적인 경로
		System.out.println(file.getAbsolutePath());
		// 예외를 발생시키는 메소드 (checked 예외로 무조건 trycatch를 해줘야함)
		try {
			System.out.println(file.getCanonicalPath());
		} catch (IOException e) {
			System.out.println("입출력 예외가 발생했습니다.");
		}
		
	}
}
