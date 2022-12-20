import java.io.File;
public class Main5 {
	public static void main(String[] args) {
		File my = new File("d:\\myfolder\\new.txt");
		
		boolean result = my.delete();
		
		System.out.println(result ? "삭제 완료" : "삭제 실패");
	}
}
