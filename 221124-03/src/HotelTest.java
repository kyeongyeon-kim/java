
import java.util.Scanner;

public class HotelTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Manager m = new Manager();
		m.makeRooms();
		boolean onOff = true;
		while (onOff) {
			System.out.println("메뉴 창 펴기 : 0번");
			int menu = scan.nextInt();
			if (menu != 0) {
				continue;
			}
			System.out.println("=================================");
			System.out.println("  1번 : 예약 하기         2번 : 객실 현황");
			System.out.println("---------------------------------");
			System.out.println(" 3번 : 객실 정보 조회    4번 : 체크 아웃 "); 
			System.out.println("---------------------------------");
			System.out.println(" 5번 : 고객 정보 조회    6번 : 고객 정보 수정 ");
			System.out.println("=================================");
			System.out.println("       그 외 정수는 프로그램 종료.");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				Room r = new Room();
				Customer c = new Customer();
				c.setCheckIn(c.checkIn());
				c.setCheckOut(c.checkOut());
				if(c.compareTo(c) != 1) {
					System.out.println("체크아웃은 체크인보다 과거일 수 없습니다.");
					continue;
				}
				System.out.println("예약자 성함을 입력하세요.");
				String csName = scan.next();
				c.setName(csName);
				System.out.println("예약자 전화번호을 입력하세요.");
				String phoneNum = scan.next();
				c.setPhoneNum(phoneNum);
				System.out.println("싱글룸으로 예약하시겠습니까? 1번   더블룸으로 예약하시겠습니까? 2번");
				int roomType = scan.nextInt();
				int csRoomNum;
				while (true) {
					csRoomNum = r.assignRooms(roomType);
					if(m.getHotelPro()[c.getCheckIn().getDay() - 1].getRooms()[csRoomNum / 100 - 2][csRoomNum % 100 - 1] == null) {
						m.getHotelPro()[c.getCheckIn().getDay() - 1].getRooms()[csRoomNum / 100 - 2][csRoomNum % 100 - 1] = new Room(c);
						break;
					}
				}
				System.out.printf("%s님 %d호에 배정되었습니다.\n<예약완료> ", csName, csRoomNum);
				System.out.println(c);
				int days = (int) c.howManyDays();
				for (int i = 0; i < days; i++) {
					m.getHotelPro()[(c.getCheckIn().getDay() - 1) + i].getRooms()[csRoomNum / 100 - 2][csRoomNum % 100 - 1] = new Room(c);
				}
				continue;
			case 2:
				System.out.println("예약현황을 확인 하고싶은 일자(DAY)를 입력해주세요.");
				int dayNum = scan.nextInt();
				if (dayNum > 1 && dayNum <= 30) {
					System.out.println("==========");
					System.out.printf("%d일 객실 현황\n", dayNum);
					System.out.println("==========");
					int emptyRoomNum = m.getHotelPro()[dayNum - 1].emptyRooms();
					System.out.printf("%d일 빈 객실 수 : %d객실\n", dayNum, emptyRoomNum);
				} else {
					System.out.println("1부터 30까지 숫자를 입력해주세요.");
				}
				continue;
			case 3:
				System.out.println("확인할 일자(DAY)를 입력해주세요.");
				int dayNum2 = scan.nextInt();
				Room r2 = m.getHotelPro()[dayNum2 - 1].Find();
				if (r2 != null) {
					System.out.println(r2);
				} else {
					System.out.println("빈방입니다.");
				}
				continue;
			case 4:
				System.out.println("체크아웃 고객 이름과 호수를 입력해주세요.");
					String name2 = scan.next();
					int roomNum = scan.nextInt();
					if(m.checkUserInfo(name2, roomNum)) {
						m.checkOutHotel(name2, roomNum);
						System.out.println("체크아웃 처리 되었습니다.");
					} else {
						System.out.println("예약자 정보가 없습니다.");
					}
				continue;
			case 5:
				System.out.println("==================================");
				System.out.println("1번 : 이름으로 조회       2번 : 전화번호로 조회");
				System.out.println("==================================");
				int button = scan.nextInt();
				if (button == 1) {
					System.out.println("이름을 입력해주세요.");
					String name3 = scan.next();
					int haveInfo = m.findByName(name3);
					if(haveInfo != 1) {
						System.out.println("예약자 정보가 없습니다.");
						continue;
					}
				} else if (button == 2) {
					System.out.println("전화번호를 입력해주세요.");
					String phoneNum3 = scan.next();
					int haveInfo = m.findByPhoneNum(phoneNum3);
					if(haveInfo != 1) {
						System.out.println("예약자 정보가 없습니다.");
						continue;
					}
				} else {
					System.out.println("올바른 번호를 입력하세요.");
				}
				break;
			case 6:
				Customer c3 = new Customer();
				System.out.println("=============================================");
				System.out.println("1번 : 이름으로 조회 후 수정       2번 : 전화번호로 조회 후 수정");
				System.out.println("=============================================");
				int button2 = scan.nextInt();
				if (button2 == 1) {
					System.out.println("이름을 입력해주세요.");
					String name4 = scan.next();
					c3 = m.modifyByName(name4);
				} else if (button2 == 2) {
					System.out.println("전화번호를 입력해주세요.");
					String phoneNum4 = scan.next();
					c3 = m.modifyByPhoneNum(phoneNum4);
				} else {
					System.out.println("올바른 값을 입력해주세요.");
					break;
				}
				if (c3 == null) {
					System.out.println("예약자 정보가 없습니다.");
					break;
				}
				System.out.println(c3);
				System.out.println("===================================");
				System.out.println("1번 :  이름 변경         2번 : 전화번호 변경");
				System.out.println("-----------------------------------");
				System.out.println("3번 : 체크인 날짜 변경  4번 : 체크 아웃 날짜변경 ");
				System.out.println("===================================");
				switch (scan.nextInt()) {
				case 1:
					System.out.println("수정할 이름을 입력하세요.");
					c3.setName(scan.next());
					System.out.println(c3);
					break;
				case 2:
					System.out.println("수정할 전화번호를 입력하세요.");
					c3.setPhoneNum(scan.next());
					System.out.println(c3);
					break;
				case 3:
					System.out.println("수정할 체크인 날짜를 입력하세요.");
					Date in = c3.checkIn();
					if (c3.getCheckOut().compareTo(in) != 1) {
						c3.setCheckIn(in);
					} else {
						System.out.println("체크인은 체크아웃보다 미래일 수 없습니다.");
						continue;
					}
					System.out.println(c3);
					break;
				case 4:
					Date out = c3.checkOut();
					if (c3.getCheckIn().compareTo(out) == 1) {
						c3.setCheckOut(out);
					} else {
						System.out.println("체크아웃은 체크인보다 과거일 수 없습니다.");
						continue;
					}
					System.out.println(c3);
					break;
				default :
					break;
				}
			default :
				break;
			}
		}
	}
}