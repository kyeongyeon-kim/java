import java.io.File;

public class Main {
	public static void main(String[] args) {
		// io == input output 약자
//		File file = new File("D:\\myfile.txt");
//		String fileName = file.getName();
//		System.out.println("파일명 :" + fileName);
//		System.out.println("경로 :" + file.getPath());
//		System.out.println("파일인가요? :" + file.isFile());
		
		
//		File file2 = new File("D:\\myfolder");
//		System.out.println(file2.getName());
//		System.out.println(file2.getPath());
//		System.out.println(file2.isFile());
//		System.out.println("폴더(디렉토리)? " + file2.isDirectory());
		
		//파일객체는 추상적인 객체로서 실제파일, 디렉토리로 존재하지않아도 자바객체로 표현할 수 있다.
		File file3 = new File("D:\\myfolder\\asdf.txt");
		System.out.println(file3.getName());
		System.out.println(file3.getPath());
		System.out.println("파일인가요? " + file3.isFile());
		System.out.println("폴더(디렉토리)?" + file3.isDirectory());
		// 파일이 있는가 먼저 확인하는게 우선되어야함
		System.out.println("실제있나요? " + file3.exists());
		
	}
}
