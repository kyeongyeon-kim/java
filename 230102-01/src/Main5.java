import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;

import dbutil.ConnectionProvider;

public class Main5 {
	private static void isertBase64Image(String encode) {
		String sql = "INSERT INTO image (filename, image) VALUES (?, ?)";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setString(1, "춘식6.png");
			stmt.setString(2, encode);
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Path image = Paths.get("D:\\kimkyeongyeon\\workspace\\230102-01\\춘식6.png");
		
		// 2진자료를 모든 바이트를 읽어서 ~ 배열로 ~
		byte[] bytes;
		try {
			bytes = Files.readAllBytes(image);
			String encode = Base64.getEncoder().encodeToString(bytes);
			
			isertBase64Image(encode);
			System.out.println("base64 인코딩된 이미지 행 추가 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
