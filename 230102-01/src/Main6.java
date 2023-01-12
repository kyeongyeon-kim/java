import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import dbutil.ConnectionProvider;

public class Main6 {
	public static byte[] decodeBase64(String encode) {
		return Base64.getDecoder().decode(encode);
	}
	
	public static void selectEncodedImage(int id) {
		String sql = "SELECT * FROM image WHERE id = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					String encode = rs.getString("image");
					byte[] decode = decodeBase64(encode);
					Files.write(Paths.get(".\\디코딩결과.png"), decode);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		selectEncodedImage(2);
	}
}
