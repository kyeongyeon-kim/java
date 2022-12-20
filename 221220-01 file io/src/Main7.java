import java.io.File;
import java.io.IOException;

public class Main7 {
	public static void main(String[] args) {
		// d드라이브
		// 하위폴더 myfolder에
		// memos 이름의 폴더를 생성하고
		// 해당경로에 todaymemo.txt 파일 생성하기
		
		// 자바에서는 '디스크'에서 '어플리케이션'으로 흐르는 흐름을 입출력 스트림이라고 부른다. (방향이 존재한다. 단방향) 디스크 > 어플리케이션 (입력)
		File memos = new File("d:\\myfolder\\memos");
		if (!memos.exists()) {
			memos.mkdir();
		}
		File memo = new File("d:\\myfolder\\memos\\todaymemo.txt");
		try {
			if (memo.createNewFile()) {
				System.out.println("파일 생성 완료");
			} else {
				System.out.println("파일이 이미 존재합니다.");
			}
		} catch (IOException e) {
			System.out.println("예외 발생");
		}
		
	}	
}
