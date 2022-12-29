
public interface IUserinfoDB {
	int create(String email, String firstname, String lastname);
	int create(Userinfo u);
	int delete(int id);
//	int update(int id, String name, String phoneNumber, String address, double score);
//	List<Restaurant> selectAll();
//	List<Restaurant> selectByName(String name);
//	int[] createList(List<Restaurant> list);
}
