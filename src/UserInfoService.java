
public interface UserInfoService {
	int INPUT_NOT_VALID = -1;
	int EMAIL_DUPLICATED = -2;
	
	int userin(String email, String firstname, String lastname);
	int userout(int id);
}
