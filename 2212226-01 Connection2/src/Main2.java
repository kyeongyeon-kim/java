import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 데이터베이스 your_db에 접속해
// book table 생성하기
public class Main2 {
	public static Connection makeConnection() {
		Connection conn = null;
		try {
			// 주소에 데이터베이스 USE 사용가능
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void closeStatement(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void createBookTable() {
		Connection conn = makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			//stmt.명령
			// 셀렉문을 조회할 때 Query
			int result = stmt.executeUpdate("CREATE TABLE IF NOT EXISTS book (" + 
					"	no INT PRIMARY KEY" + 
					"    , title VARCHAR(25)" + 
					"    , price INT);");
			System.out.println("결과값 : " + result);
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			closeStatement(stmt);
			closeConnection(conn);
		}
	}

	public static void main(String[] args) {
		// 드라이버 적재 (클래스 로드)
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// 책 테이블(book) 행 추가, ('파워자바', 25000)
		// 접속
		Connection conn = makeConnection();
		Statement stmt = null;
		try {
			// 명령어(insert into) 수행
			stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO book VALUES ();");
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			// 접속해제
			closeStatement(stmt);
			closeConnection(conn);
		}
	}
}
