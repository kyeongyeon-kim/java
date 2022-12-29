
public interface UserinfoRepository {
	// DB입출력의 기능만 구현
	int countByEmail(String email);
	Userinfo selectByEmail(String email);
	int insert(String email, String firstname, String lastname); // pk반환
}
