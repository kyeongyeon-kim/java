import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File file = new File("D:\\myfolder\\sum.txt");

		FileReader fr = null;

		try {
			fr = new FileReader(file);
			int c;
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println("더하기 수행 기록이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("첫번째 정수 ? ");
		int left = scan.nextInt();

		System.out.println("두번째 정수 ? ");
		int right = scan.nextInt();

		int sum = left + right;
		System.out.println("결과 : " + sum);

		FileWriter fw = null;

		try {
			fw = new FileWriter(file);

			String line = left + " + " + right + " = " + sum;
			fw.write(line);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
