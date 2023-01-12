import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.ConnectionProvider;

public class Main {
	private static void copy(InputStream inputStream, String filename) {
		try (BufferedInputStream bis = new BufferedInputStream(inputStream);
				BufferedOutputStream bos = new BufferedOutputStream(
						new FileOutputStream(filename))) {
			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement stmt = conn.prepareStatement("SELECT * FROM image WHERE id = ?")) {
					stmt.setInt(1, 1);
					
					try (ResultSet rs = stmt.executeQuery()) {
						if (rs.next()) {
							int id = rs.getInt("id");
							String filename = rs.getString("filename");
							Blob image = rs.getBlob("image");
							InputStream inputStream = image.getBinaryStream();
							// 복사 시 옵션, StandardCopyOption.REPLACE_EXISTING = 이미 있는거 덮어쓸거임
							Files.copy(inputStream, Paths.get(filename), StandardCopyOption.REPLACE_EXISTING);
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("파일 복사 완료");
				} catch (SQLException e) {
					e.printStackTrace();
				} 
	}
}
