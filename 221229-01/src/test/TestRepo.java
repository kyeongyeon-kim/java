package test;
import user.Userinfo;
import user.UserinfoRepository;
import user.UserinfoRepositoryImpl;

public class TestRepo {
	public static void main(String[] args) {
		UserinfoRepository repo = new UserinfoRepositoryImpl();
		
		int count = repo.countByEmail("asdf@google.com");
		System.out.println("개수 : " + count);
		Userinfo info = repo.selectByEmail("asdf@google.com");
		
		int pk = repo.insert("qqqq@qqqq.com", "qqqq", "qqqq");
		System.out.println("생성 pk : " + pk);
	}
}
