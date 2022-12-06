import java.util.HashMap;
import java.util.Map;

class My {
	private int number;
	private String str;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof My))
			return false;
		My other = (My) obj;
		if (number != other.number)
			return false;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}
	public My(int number, String str) {
		super();
		this.number = number;
		this.str = str;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "My [number=" + number + ", str=" + str + "]";
	}
	
	
}

public class Main6 {
	public static void main(String[] args) {
		Map<My, Object> map = new HashMap<>();
		
		map.put(new My(100, "abc"), "아무 밸류 객체");
		map.put(new My(100, "abc"), "아무 밸류 객체");
		map.put(new My(100, "abc"), "아무 밸류 객체");
		
		System.out.println(map.size());
		System.out.println(map);
		
		System.out.println(map.get(new My(100, "abc")));
	}
}
