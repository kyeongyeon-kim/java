
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UserInfos implements UserInputEventListener {
	private Map<String, String> users;
	private UserFrame frame;
	private UserFileRepository repo;
	
	public UserInfos() {
		users = new LinkedHashMap<>();
		frame = new UserFrame(this);
		repo = new UserFileRepository();
	}
	
	public void start() {
		Map<String, String> map = repo.readUser();
		for (Entry<String, String> e : map.entrySet()) {
			frame.addUser(e.getKey(), e.getValue());
		}
		frame.setVisible(true); 
	}
	
	public void userInputCompleted(String name, String phone) {
		users.put(name, phone);
		repo.writeUser(users);
		frame.addUser(name, phone);
	}

	@Override
	public void userInputCompleted(UserInputEvent e) {
		userInputCompleted(e.getUserName(), e.getUserPhone());
	}
}











