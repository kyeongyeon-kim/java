import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
	public static void main(String[] args) {
		File file = new File("D:\\myfolder\\둘리.txt");
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String name = br.readLine();
			int age = Integer.valueOf(br.readLine());
			double height = Double.valueOf(br.readLine());
			String hobby = br.readLine();
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(height);
			System.out.println(hobby);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
