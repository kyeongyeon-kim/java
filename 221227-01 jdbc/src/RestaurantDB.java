import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.ConnectionProvider;

public class RestaurantDB {
	// 식당 행 추가하기
	public int create(String name, String phoneNumber, String address, double score) {
		Connection conn = ConnectionProvider.makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			return stmt.executeUpdate("INSERT INTO restaurant (name, phoneNumber, address, score)" + " VALUES ('" + name
					+ "', '" + phoneNumber + "', '" + address + "', " + score + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionProvider.closeStatement(stmt);
			ConnectionProvider.closeConnection(conn);
		}
		return 0;
	}

	public int create(Restaurant restaurant) {
		return create(restaurant.getName(), restaurant.getPhoneNumber(), restaurant.getAddress(),
				restaurant.getScore());
	}

	// 식당 행(pk로) 삭제하기
	public int delete(int pkNum) {
		Connection conn = ConnectionProvider.makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			return stmt.executeUpdate("DELETE FROM restaurant WHERE no = " + pkNum + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionProvider.closeStatement(stmt);
			ConnectionProvider.closeConnection(conn);
		}
		return 0;
	}

	// 식당 행(pk로) 수정하기
	public int update(int pkNum, String name, String phoneNumber, String address, double score) {
		Connection conn = ConnectionProvider.makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			return stmt.executeUpdate("UPDATE restaurant SET name = '" + name + "'," + " phoneNumber = '" + phoneNumber
					+ "', address = '" + address + "', score = " + score + " WHERE no = " + pkNum + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionProvider.closeStatement(stmt);
			ConnectionProvider.closeConnection(conn);
		}
		return 0;
	}

	// 식당 전부 다 조회하기
	public List<Restaurant> selectAll() {
		Connection conn = ConnectionProvider.makeConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM restaurant");
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
		} finally {
			ConnectionProvider.closeResultSet(rs);
			ConnectionProvider.closeStatement(stmt);
			ConnectionProvider.closeConnection(conn);
		}
		return list;
	}

	// 식당 이름으로 검색해서 조회하기
	public List<Restaurant> selectRestaurantByName(String restName) {
		Connection conn = ConnectionProvider.makeConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM restaurant WHERE name = '" + restName + "';");
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
		} finally {
			ConnectionProvider.closeResultSet(rs);
			ConnectionProvider.closeStatement(stmt);
			ConnectionProvider.closeConnection(conn);
		}
		return list;
	}

	// 집계 식당 총 몇 개?
	public int countRestaurant() {
		return selectAll().size();
	}

	// 정수 범위 X ~ Y 사이에 있는 식당 조회하기
	public List<Restaurant> selectByScoreRange(int x, int y) {
		Connection conn = ConnectionProvider.makeConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Restaurant> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM restaurant WHERE score BETWEEN " + x + " AND " + y + "");
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
		} finally {
			ConnectionProvider.closeResultSet(rs);
			ConnectionProvider.closeStatement(stmt);
			ConnectionProvider.closeConnection(conn);
		}
		return list;
	}

	public int createValues(List<Restaurant> list) {
		Connection conn = ConnectionProvider.makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			for (int i = 0; i < list.size(); i++) {
				String name = list.get(i).getName();
				String phoneNumber = list.get(i).getPhoneNumber();
				String address = list.get(i).getAddress();
				double score = list.get(i).getScore();
				stmt.executeUpdate("INSERT INTO restaurant (name, phoneNumber, address, score)" + " VALUES ('" + name
						+ "', '" + phoneNumber + "', '" + address + "', " + score + ")");
			}
			return list.size();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionProvider.closeStatement(stmt);
			ConnectionProvider.closeConnection(conn);
		}
		return 0;
	}
	//list<식당> 모든 원소 행 추가
    public int createWithList(List<Restaurant> list) {
       int sum = 0;
       for(Restaurant r : list) {
          sum += create(r);
       }
       return sum;
    }
}
