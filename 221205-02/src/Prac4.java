import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 11명의 선발명단을 짤 수 있게끔 사용자에게 모든 선수 명단을 보여주고,
	입력(등번호 or 이름) -> 선발명단에 추가 (한 선수는 한번씩만 가능)
	반복 => 11명이 가득차면 최종명단을 볼 수 있어야함.
	1 김승규
	12 송범근
	21 조현우
	20 권경원
	15 김문환
	4 김민재
	19 김영권
	3 김진수
	23 김태환
	2 윤종규
	24 조유민
	14 홍철
	22 권창훈
	17 나상호
	8 백승호
	13 손준호
	7 손흥민
	26 송민규
	18 이강인
	10 이재성
	5 정우영
	25 정우영
	6 황인범
	11 황희찬
	9 조규성
	16 황의조
*/
class Player {
	private String backNum;
	private String name;
	
	public Player(String backNum, String name) {
		super();
		this.backNum = backNum;
		this.name = name;
	}

	@Override
	public String toString() {
		return "등번호 : " + backNum + " 이름 : " + name + "\n";
	}

	public String getBackNum() {
		return backNum;
	}

	public void setBackNum(String backNum) {
		this.backNum = backNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Prac4 {
	
	static final Player P1 = new Player("1" ,"김승규");
	static final Player P12 = new Player("12" ,"송범근");
	static final Player P21 = new Player("21" ,"조현우");
	static final Player P20 = new Player("20" ,"권경원");
	static final Player P15 = new Player("15" ,"김문환");
	static final Player P4 = new Player("4" ,"김민재");
	static final Player P19 = new Player("19" ,"김영권");
	static final Player P3 = new Player("3" ,"김진수");
	static final Player P23 = new Player("13" ,"김태환");
	static final Player P2 = new Player("2" ,"윤종규");
	static final Player P24 = new Player("24" ,"조유민");
	static final Player P14 = new Player("14" ,"홍철");
	static final Player P22 = new Player("22" ,"권창훈");
	static final Player P17 = new Player("17" ,"나상호");
	static final Player P8 = new Player("8" ,"백승호");
	static final Player P13 = new Player("13" ,"손준호");
	static final Player P7 = new Player("7" ,"손흥민");
	static final Player P26 = new Player("26" ,"송민규");
	static final Player P18 = new Player("18" ,"이강인");
	static final Player P10 = new Player("10" ,"이재성");
	static final Player P5 = new Player("5" ,"정우영");
	static final Player P25 = new Player("25" ,"정우영");
	static final Player P6 = new Player("6" ,"황인범");
	static final Player P11 = new Player("11" ,"황희찬");
	static final Player P9 = new Player("9" ,"조규성");
	static final Player P16 = new Player("16" ,"황의조");
	

	public static boolean isNumberChar(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean isNumberFormat2(String value) {
		for (int i = 0; i < value.length(); i++) {
			if (!isNumberChar(value.charAt(i))) {
				return false;
			}
		}
		return true;
	}
	public static <T> void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		List<Player> bestEleven = new ArrayList<>(11);
		List<Player> entry = new ArrayList<>(Arrays.asList(P1, P12, P21, P20, P15
															, P4, P19, P3, P23, P2
															, P2, P24, P14, P22, P17
															, P8, P13, P7, P26, P18
															, P10, P5, P25, P6, P11
															, P11, P9, P16));
		Collections.sort(entry, new Comparator<Player>() {
			@Override
			public int compare(Player o1, Player o2) {
				int num1 = Integer.parseInt(o1.getBackNum());
				int num2 = Integer.parseInt(o2.getBackNum());
				return num1 - num2;
			}
		});;
		System.out.println(entry);
		boolean onOff = true;
		int count = 0;
		while (onOff) {
			System.out.println("==========================");
			System.out.println("선수의 등번호 혹은 이름을 입력해주세요.");
			System.out.println("==========================");
			String input = scan.next();
			if (isNumberFormat2(input)) {
				for (int i = 0; i < entry.size(); i++) {
					if (entry.get(i).getBackNum().equals(input)) {
						bestEleven.add(entry.get(i));
					}
					for (int j = 1; j < bestEleven.size(); j++) {
						if (bestEleven.get(bestEleven.size() - 1) == bestEleven.get(j - 1)) {
							bestEleven.remove(bestEleven.size() - 1);
							System.out.println("중복된 선수를 명단에 넣을 수 없습니다.");
						}
					}
					System.out.println(entry.get(i) + "\nbestEleven에 추가되었습니다.");
				}
			} else if (!isNumberFormat2(input)) {
				for (int i = 0; i < entry.size(); i++) {
					if (entry.get(i).getName().equals(input)) {
						bestEleven.add(entry.get(i));
						System.out.println(entry.get(i) + "\nbestEleven에 추가되었습니다.");
					}
				}
			} 
			
			onOff = bestEleven.size() != 11 ? true : false;
			System.out.println(11 - bestEleven.size() + "명 더 선택해주세요.");
		}
		System.out.println(bestEleven);
	}
}
