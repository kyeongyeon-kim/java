import java.util.List;

public interface IRestaurantDB {
	int create(String name, String phoneNumber, String address, double score);
	int create(Restaurant r);
	int delete(int id);
	int update(int id, String name, String phoneNumber, String address, double score);
	List<Restaurant> selectAll();
	List<Restaurant> selectByName(String name);
	int[] createList(List<Restaurant> list);
}
