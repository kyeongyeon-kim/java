import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

// 프로그램 실행 시
// 마지막 방문자의 방명록 기록을 볼 수 있음(문자열)

// 새 기록을 남기는 동작이 가능.

public class Main2 {
	public static String readFile(File file) {
		FileReader fr = null;
		
//		String result = "";
		StringBuilder result = new StringBuilder();
		try {

			fr = new FileReader(file);

			int a;
			while ((a = fr.read()) != -1) {
//				result += (char) a;
				result.append((char) a);
			}
		} catch (FileNotFoundException e) {
			System.out.println("이전 방명록 기록이 없습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result.toString();
	}
	// 오버헤드를 줄이기위한 
	public static String readFileWithBuffer(File file) {
		// 삽과 트럭을 모두 가진 클래스
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		
		try {
			br = new BufferedReader(new FileReader(file));
			
			String line;
			while((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					// 파일리더는 br이 닫히면서 같이 닫힘
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return sb.toString();
	}
	
	public static void writeFile(File file, String line) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);


			fw.write(line);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
	
	public static void writeFileWithBuffer(File file, String line) {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(file));
			bw.write(line);
			// 출력 물내림 메소드(출력시 버퍼의 모든공간이 다차야 출력되는데 그 현상을 해결해주는 메소드)
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		File visitMessage = new File("D:\\myfolder\\visitMessage.txt");

		String lastHistory = readFileWithBuffer(visitMessage);
		System.out.println(lastHistory);

		System.out.println("방명록을 남겨주세요.");
		System.out.println("이름? ");
		String name = scan.next();
		System.out.println("메세지? ");
		String message = scan.next();
		
		String line = name + "(" + LocalDate.now() + ")" + message;

		writeFileWithBuffer(visitMessage, line);
	}
}
