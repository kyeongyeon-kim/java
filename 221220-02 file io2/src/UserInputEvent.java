
public class UserInputEvent {
	private String userName;
	private String userPhone;
	public UserInputEvent(String userName, String userPhone) {
		super();
		this.userName = userName;
		this.userPhone = userPhone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
}
