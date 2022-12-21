import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main2 {
	public static void main(String[] args) {
		// 여러 기초형 타입의 정보를 기록
		// 사람
		// 이름, 나이, 키, 취미
		// String, int, double, String
		
		String name = "둘리";
		int age = 22;
		double height = 180.3;
		String hobby = "호잇";
		
		File file = new File("D:\\myfolder\\둘리.txt");
		// PrintWriter == 다양한 기본형타입을 출력할 수 있다.
		try (PrintWriter pw 
				= new PrintWriter(new FileWriter(file))){
			pw.println(name);
			pw.println(age);
			pw.println(height);
			pw.println(hobby);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
