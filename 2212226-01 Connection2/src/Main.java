import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// deprecated 추후 버전에서 삭제될 가능성이 있는 클래스, 메소드 등 (쓰지마!)
public class Main {
	public static void main(String[] args) {
		// 드라이버 준비 (라이브러리 추가)
		// 드라이버 적재 (클래스 로드) 자바에서 DB를 만드는 방식을 정의 해줌 ==> JDBC인터페이스 (데이터베이스는 누가 만들었는지 모르기에 동등하게 사용하기 위해서 필요한 단계)
		// 커넥션, 스테이트먼트 (인터페이스) 드라이브매니저(클래스) 메소드와 객체를 연결하기위해 어떤식으로 사용할건지 클래스에게 알려주기위해 필요한 단계(드라이버 적재)
		// Class.forName를 실행하면 스태틱블럭이 실행됨 (객체를 알 수 있게끔 해주는 메소드)
		//Class.forName("드라이버의패키지명.클래스명");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("적재 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
		// 서버의 주소, 계정의 아이디-비밀번호 (127.0.01)
		String url = "jdbc:mysql://localhost:3306";
		String id = "root";
		String password = "root";
		// DB 연결 객체 :Connection 인터페이스
		Connection conn = null;
		Statement stmt = null;
		try {
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("접속 성공");
			// 명령을 위한 인터페이스
			stmt = conn.createStatement();
			// 객체 생성, 추가, 수정 등등 Update
			//stmt.executeUpdate("SQL 명령어");
			stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS your_db");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 마지막에 연 것을 먼저 닫아 준다.
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
