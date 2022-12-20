import java.io.File;

public class Main6 {
	public static void main(String[] args) {
		File my = new File("d:\\myfolder\\newfolder");
		
		boolean result = my.mkdir();
		
		System.out.println(result ? "폴더 생성 완료" : "폴더 생성 실패");
	}
}
