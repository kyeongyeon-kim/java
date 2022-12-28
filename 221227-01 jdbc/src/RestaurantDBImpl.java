import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dbutil.ConnectionProvider;

public class RestaurantDBImpl implements IRestaurantDB {
	// SQL인덱션 방어를 위한 새로운 표현
	// 인터페이스를 만든 이유 : 똑같은 메소드 그대로 쓰기 위해서

	@Override
	public int[] createList(List<Restaurant> list) {
		// 결함이 있는 데이터의 경우 하나의 정상적인 동작이 됐다고 할 수 없다.
		// list (동작 : O, X, O) 이런 동작은 결함이 생겼다고 볼 수 있다.
		// 방지하기위한 '트랜잭션' : 커넥션객체가 트랜잭션을 제어한다.

		String sql = "INSERT INTO restaurant (name, phoneNumber, address, score)" + " VALUES (?, ?, ?, ?)";
		Connection conn = ConnectionProvider.makeConnection();

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
			conn.setAutoCommit(false);

			for (Restaurant r : list) {
				pstmt.setString(1, r.getName());
				pstmt.setString(2, r.getPhoneNumber());
				pstmt.setString(3, r.getAddress());
				pstmt.setDouble(4, r.getScore());
				// addBatch : INSERT문을 하나 생성해주는데 반복문이 동작할 때 마다 INSERT문을 생성해줌
				pstmt.addBatch();
			}
			int[] result = pstmt.executeBatch();
			conn.commit();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			ConnectionProvider.closeConnection(conn);
		}
		return null;
	}

	@Override
	public int create(String name, String phoneNumber, String address, double score) {
		String sql = "INSERT INTO restaurant (name, phoneNumber, address, score)" + " VALUES (?, ?, ?, ?)";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setDouble(4, score);

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int create(Restaurant r) {
		return create(r.getName(), r.getPhoneNumber(), r.getAddress(), r.getScore());
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM restaurant WHERE no = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(int id, String name, String phoneNumber, String address, double score) {
		String sql = "UPDATE restaurant" + " SET name = ?, phoneNumber = ?, address = ?, score = ?" + " WHERE no = ?";
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, phoneNumber);
			pstmt.setString(3, address);
			pstmt.setDouble(4, score);
			pstmt.setInt(5, id);

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<Restaurant> selectAll() {
		String sql = "SELECT * FROM restaurant";
		List<Restaurant> list = new ArrayList<>();
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				int id = rs.getInt("no");
				String name = rs.getString("name");
				String phoneNumber = rs.getString("phoneNumber");
				String address = rs.getString("address");
				double score = rs.getDouble("score");

				list.add(new Restaurant(id, name, phoneNumber, address, score));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Restaurant> selectByName(String n) {
		String sql = "SELECT * FROM restaurant WHERE name = ?";
		List<Restaurant> list = new ArrayList<>();
		try (Connection conn = ConnectionProvider.makeConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, n);

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("no");
					String name = rs.getString("name");
					String phoneNumber = rs.getString("phoneNumber");
					String address = rs.getString("address");
					double score = rs.getDouble("score");

					list.add(new Restaurant(id, name, phoneNumber, address, score));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
