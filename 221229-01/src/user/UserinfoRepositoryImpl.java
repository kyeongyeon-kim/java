package user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbutil.ConnectionProvider;
import exception.DataIOException;

public class UserinfoRepositoryImpl implements UserinfoRepository {
	@Override
	public int countByEmail(String email) {
		String sql = "SELECT COUNT(*) AS 'COUNT' FROM userinfo WHERE email = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, email);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					return rs.getInt("COUNT");
				}
			}
		} catch (SQLException e) {
			// 예외를 직접 처리하지 않고, 호출한 메소드에서 처리할 수 있도록
			// unchecked 예외는 throws를 적지않더라도 생략 가능
			// SQL예외가 발생했을 때 DataIOException는 SQL예외 객체를 갖게 된다.
			throw new DataIOException(e);
		}
		return 0;
	}

	@Override
	public Userinfo selectByEmail(String email) {
		String sql = "SELECT id, email, firstname, lastname FROM userinfo WHERE email = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, email);
			try (ResultSet rs = pstmt.executeQuery()) {
				if (rs.next()) {
					int id = rs.getInt("id");
					String e = rs.getString("email");
					String firstname = rs.getString("firstname");
					String lastname = rs.getString("lastname");
					return new Userinfo(id, e, firstname, lastname);
				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
		return null;
	}

	@Override
	public int insert(String email, String firstname, String lastname) {
		String insert = "INSERT INTO userinfo (email, firstname, lastname)" 
					+ " VALUES (?, ?, ?)";
		try (Connection conn = ConnectionProvider.makeConnection();
				// 생성된 pk값을 리턴해주는 방법
				PreparedStatement pstmt = conn.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS)) {
			pstmt.setString(1, email);
			pstmt.setString(2, firstname);
			pstmt.setString(3, lastname);
			
			pstmt.executeUpdate();
			try (ResultSet rs = pstmt.getGeneratedKeys()) {
				if (rs.next()) {
					// 컬럼 순서로도 getter할 수 있다
					return rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
		return 0;
	}

	@Override
	public int countById(int id, Connection conn) {
		String sql = "SELECT count(*) FROM userinfo WHERE id = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			
			try (ResultSet rs = stmt.executeQuery()) {
				if (rs.next()) {
					return rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
		return 0;
	}

	@Override
	public int move(int id, Connection conn) {
		String sql = "INSERT INTO userinfo_inactive (id, email, firstname, lastname)"
				+ " SELECT id, email, firstname, lastname FROM userinfo WHERE id = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			
			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
	}

	@Override
	public int delete(int id, Connection conn) {
		String sql = "DELETE FROM userinfo WHERE id = ?";
		try (PreparedStatement stmt = conn.prepareStatement(sql)) {
			stmt.setInt(1, id);
			
			return stmt.executeUpdate();
		} catch (SQLException e) {
			throw new DataIOException(e);
		}
	}
}