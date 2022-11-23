
public class DollFactory {
	// 인형 생산
	// 주의점. null을 반환할 가능성이 생겼음.
	public Doll produceDoll(int no) {
		if (no == 1) {
			Doll d = new Doll("사탄의인형", 15000);
			return d;
		} else if (no == 2) {
			Doll d = new Doll("허기워기", 19000);
			return d;
		} else if (no == 3) {
			Doll d = new Doll("바비", 50000);
			return d;
		} else {
			return null;
		}
	}
}
