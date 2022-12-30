package user;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dbutil.ConnectionProvider;
import exception.DataIOException;
import exception.InputNotValidException;

public class UserinfoServiceImpl implements UserinfoService {
	private UserinfoRepository repo;

	public UserinfoServiceImpl(UserinfoRepository repo) {
		super();
		this.repo = repo;
	}

	// 1. 문자열 값 유효한지 확인(길이 및 NOT NULL)
//	public boolean verifyString(String str, int length) {
//		if (str == null || str.isEmpty()) {
//			return false;
//		}
//		if (str.length() > length) {
//			return false;
//		}
//		return true;
//	}

	public boolean isValidEmail(String email) {
		Pattern p = Pattern.compile("[a-z]{1,15}@[a-z.]{1,15}");
		Matcher m = p.matcher(email);
		return m.matches();
	}

	public boolean isValidName(String firstname, String lastname) {
		Pattern p = Pattern.compile("[a-zA-zㄱ-힣]{1,15}");
		Matcher m = p.matcher(firstname);
		Matcher m2 = p.matcher(lastname);
		if (m.matches() && m2.matches()) {
			return true;
		}
		return false;
	}
	// repository를 구현해놓은 클래스에서 재정의하기 전 혹은 구현해놓은 클래스가 없다면 껍데기메소드인지? O
	// 생성자로 인터페이스를 생성자에서 구현한 이유? O
	// 클래스안에 인터페이스 필드 == 의존성이 생겼다. O
	// ex) 가짜클래스만든이유 ? 진짜 재정의한 메소드를 갖고 있는 클래스를 테스트하기 전
	// 가짜 값 메소드를 갖고 있는 클래스로 테스트 하기 위함 O
	// 인터페이스를 구현한 클래스의 재정의한 메소드를 갈아끼우기 위한? O
	// ex) 같은 인터페이스가 구현된 클래스로 생성할 때마다 클래스에 맞는 메소드로 동작이 변경되는건지
	// 객체를 인터페이스형으로 만든 이유?

	@Override
	public int userin(String email, String firstname, String lastname) throws DataIOException {
		if (!isValidEmail(email) || !isValidName(firstname, lastname)) {
			throw new InputNotValidException("입력값이 유효하지 않습니다.");
		}
		if (repo.countByEmail(email) == 1) {
			throw new InputNotValidException("이메일이 중복되었습니다.");
		}
		return repo.insert(email, firstname, lastname);
	}

	@Override
	public int userout(int id) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.makeConnection();
			conn.setAutoCommit(false);

			int count = repo.countById(id, conn);
			if (count > 0) {
				int move = repo.move(id, conn);
				int result = repo.delete(id, conn);
				conn.commit();

				return result;
			}

		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			ConnectionProvider.closeConnection(conn);

		}
		return 0;
	}
}
