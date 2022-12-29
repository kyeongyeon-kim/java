package ddaa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.ConnectionProvider;

public class UserinfoRepo implements UserinfoRepository {
	@Override
	public int countByEmail(String email) {
		String sql = "SELECT COUNT(*) AS 'COUNT' FROM userinfo WHERE email = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				return rs.getInt("COUNT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return 0;
	}

	@Override
	public Userinfo selectByEmail(String email) {
		String sql = "SELECT * FROM userinfo WHERE email = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, email);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String e = rs.getString("email");
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				return new Userinfo(id, e, firstname, lastname);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int insert(String email, String firstname, String lastname) {

		String sql = "INSERT INTO userinfo (email, firstname, lastname)" 
					+ " VALUES (?, ?, ?)";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, email);
			pstmt.setString(2, firstname);
			pstmt.setString(3, lastname);
			pstmt.executeUpdate();
			return lastInsertID();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int lastInsertID() {
		String sql = "SELECT LAST_INSERT_ID() AS 'LASTINSERT';";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			if (rs.next()) {
				return rs.getInt("LASTINSERT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}