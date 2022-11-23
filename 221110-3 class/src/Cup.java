// 현재용량

// 용량 감소기능
public class Cup {
	int volume;
	
	int pour() {
		if (volume >= 10) {
			volume  -= 10;
		}
		return volume;
	}
}
