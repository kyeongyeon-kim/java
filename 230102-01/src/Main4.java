import java.util.Arrays;
import java.util.Base64;

public class Main4 {
	public static void main(String[] args) {
		// 베이스64 encoding
		// 2진데이터를 영문자로 변경 = encode, 영문자에서 2진데이터로 변경 = decode
		String line = "문자열원본";
		
		// 파일의 2진데이터형으로 표현
		System.out.println(Arrays.toString(line.getBytes()));
		
		// 인코드 작업
		String encoded = Base64.getEncoder().encodeToString(line.getBytes());
		System.out.println(encoded);
		
		// 디코드 작업
		byte[] decode = Base64.getDecoder().decode(encoded);
		System.out.println("디코딩된 원본 : " + new String(decode));
		
	}
}
