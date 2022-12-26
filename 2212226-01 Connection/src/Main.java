import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		// 데이터베이스 서버에 접속(연결)을 원함.
		// 주소 (jdbc:mysql:) 프로토콜 명시 부분, (localhost) 내컴퓨터를 의미, (3306) mysql의 포트 번호
		String url = "jdbc:mysql://localhost:3306";
		// 아이디
		String id = "root";
		// 비밀번호
		String password = "root";
		
		// 드라이버 적재(클래스 로드) 어플리케이션마다 한 번만 해주면 된다.
		// 오타 혹은 라이브러리 추가 안되었다면 예외 발생
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 적재 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		}
		// 등록한 드라이버를 관리하는 매니저
		// 접속 실패 시
		// 1. 서버가 꺼져있는 경우  2. IP주소가 잘못 된 경우 3.포트번호가 잘못 된 경우 4. 아이디 비밀번호 틀렸을 때
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결 성공");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("접속(연결)에 실패하였습니다.");
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		try (Connection anotherConn = DriverManager.getConnection(url, id, password)){
			System.out.println("데이터베이스 연결 한번 더");
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
}
