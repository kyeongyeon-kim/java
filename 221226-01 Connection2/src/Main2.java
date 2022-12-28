import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
// 정적 임포트 == 정적 멤버들을 내 것처럼 사용하겠다.
import static dbutil.ConnectionProvider.*;
// 데이터베이스 your_db에 접속해
// book table 생성하기
public class Main2 {
	

	public static void createBookTable() {
		Connection conn = makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			// stmt.명령
			// 셀렉문을 조회할 때 Query
			int result = stmt.executeUpdate("CREATE TABLE IF NOT EXISTS book (" + "	no INT PRIMARY KEY"
					+ "    , title VARCHAR(25)" + "    , price INT);");
			System.out.println("결과값 : " + result);
		} catch (SQLException e) {
			e.getStackTrace();
		} finally {
			closeStatement(stmt);
			closeConnection(conn);
		}
	}

	public static int insertBook(int no, String title, int price) {
		Connection conn = makeConnection();
		Statement stmt = null;
		try {
			// 명령어(insert into) 수행
			// statement객체는 명령 마무리에 자동으로 세미콜론을 찍어준다.
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(
					"INSERT INTO book (no, title, price) VALUES (" + no + ", '" + title + "', " + price + ");");
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 접속해제
			closeStatement(stmt);
			closeConnection(conn);
		}
		return 0;
	}

	public static int deleteBook(int no) {
		Connection conn = makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			return stmt.executeUpdate("DELETE FROM book WHERE no = " + no + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 접속해제
			closeStatement(stmt);
			closeConnection(conn);
		}
		return 0;
	}

	public static int updateBook(int no, String newTitle, int newPrice) {
		Connection conn = makeConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			return stmt.executeUpdate(
					"UPDATE book SET title = '" + newTitle + "', price = " + newPrice + " WHERE no = " + no + ";");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 접속해제
			closeStatement(stmt);
			closeConnection(conn);
		}
		return 0;
	}
	
	public static List<Book> selectAllBook() {
		Connection conn = makeConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM book WHERE title = '파워자바';");
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				list.add(new Book(no, title, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResultSet(rs);
			closeStatement(stmt);
			closeConnection(conn);
		}
		return list;
	}
	
	public static List<Book> selectBookByTitle(String t) {
		Connection conn = makeConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Book> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			// ResultSet = 한 행의 정보를 전달해줌
			rs = stmt.executeQuery("SELECT * FROM book WHERE title = '" + t + "';");
			while (rs.next()) {
				int no = rs.getInt("no");
				String title = rs.getString("title");
				int price = rs.getInt("price");
				
				list.add(new Book(no, title, price));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResultSet(rs);
			closeStatement(stmt);
			closeConnection(conn);
		}
		return list;
	}
	
	public static void main(String[] args) {
		// 드라이버 적재 (클래스 로드)
		

		// 책 테이블(book) 행 추가, ('파워자바', 25000)
		// 책 (2, '자기관리론', 10350)
		// 접속
//		int result = insertBook(3, "올바름이라는착각", 14850);
//		System.out.println(result + "행 추가");
//		int result = deleteBook(3);
//		System.out.println(result + "행 삭제");
//		int result = updateBook(2, "트렌드코리아", 17100);
//		System.out.println(result + "행의 book이 update되었습니다.");
		
		// 책 테이블에서 제목으로 검색하여 같은 이름의 책 모든 컬럼 값 콘솔 출력하기
//		List<Book> books = selectAllBook();
//		System.out.println(books);
		
		List<Book> books = selectBookByTitle("파워자바");
		System.out.println(books.size());
		
		List<Book> books2 = selectBookByTitle("없는제목");
		System.out.println(books2.size());
	}
}
