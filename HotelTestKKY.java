import java.util.Scanner;



import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

class Customer {
	Scanner scan = new Scanner(System.in);
	private String name;
	private String phoneNum;
	private Date checkIn;
	private Date checkOut;


	public Customer() {
		
	}
	
	public Customer(String name, String phoneNum, Date checkIn, Date checkOut) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Customer(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public Customer(String name, String phoneNum) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
	}


	@Override
	public String toString() {
		return "<예약정보> 예약자명 : " + name + " 전화번호 : " + phoneNum + " 체크인 : " + checkIn + " 체크아웃 : " + checkOut;
	}
	
	public Date checkIn() {
		System.out.println("체크인을 원하는 년/월/일을 순서대로 입력해주세요.");
		int year = scan.nextInt();
		int month = scan.nextInt();
		int day = scan.nextInt();
		return new Date(year, month, day);
	}
	
	public Date checkOut() {
		System.out.println("체크아웃을 원하는 년/월/일을 순서대로 입력해주세요.");
		int year2 = scan.nextInt();
		int month2 = scan.nextInt();
		int day2 = scan.nextInt();
		return new Date(year2, month2, day2);
	}
	
	public long howManyDays() {
		Calendar in = new GregorianCalendar(checkIn.getYear(), checkIn.getMonth() - 1, checkIn.getDay());
		Calendar out = new GregorianCalendar(checkOut.getYear(), checkOut.getMonth() - 1, checkOut.getDay());
		long diffSec = (out.getTimeInMillis() - in.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24 * 60 * 60);
		System.out.printf("체크인 : %d/%d/%d\n", checkIn.getYear(), checkIn.getMonth(),checkIn.getDay());
	System.out.printf("체크아웃 : %d/%d/%d\n", checkOut.getYear(), checkOut.getMonth() - 1, checkOut.getDay());
	System.out.printf("총 %d박%d일\n", diffDays, diffDays + 1);
		return diffDays + 1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNum == null) ? 0 : phoneNum.hashCode());
		return result;
	}

	
	
	
}
class Date {
	Scanner scan = new Scanner(System.in);
	private int year;
	private int month;
	private int day;
	
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "[" + year + "/" + month + "/" + day + "]";
		
	}
	
	
	
	
}
class Room {
	Scanner scan = new Scanner(System.in);
	private Customer customers;
	
	

	public Room() {
		
	}
	
	public Room(Customer customers) {
		this.customers = customers;
	}
	public Customer getCustomers() {
		return customers;
	}
	public void setCustomers(Customer customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Room [" + customers + "]";
	}
	
	public int assignRooms() {
		while (true) {
			System.out.println("싱글룸으로 예약하시겠습니까? 1번. 더블룸으로 예약하시겠습니까? 2번.");
			switch(scan.nextInt()) {
			case 1:
				int assignRooms = singleRoom();
				return assignRooms;
			case 2:
				int assignRooms2 = doubleRoom();
				return assignRooms2;
			default:
				System.out.println();
				break;
			}
		}
	}
	
	// roomNum == 방번호가 201이상 이고 520이하이며, 20호실을 넘어가지 않도록 설정.(300, 400, 500도 출력되지않음)
		public int randomRoomNum() {
			while (true) {
				int roomNum = (int)(Math.random() * 1000) + 1;
				boolean trueRoomNum = roomNum <= 520 && roomNum > 200 && roomNum % 100 <= 20 && roomNum % 100 != 0;
				if (trueRoomNum) {
					return roomNum;
					}
				}
		}
		public int singleRoom() {
			while (true) {
				int num = randomRoomNum();
				if (num % 2 == 1) {
					return num;
				}
			}
		}
		public int doubleRoom() {
			while (true) {
				int num = randomRoomNum();
				if (num % 2 == 0) {
					return num;
				}
			}
		}
	
}

class HotelPro {
	Scanner scan = new Scanner(System.in);
	private Room[][] rooms;
	
	
	
	
	// 1층 로비 , 2~5층 객실 존재, 층마다 20객실
	// 홀수면 true == 싱글룸, 짝수면 false == 더블룸

	@Override
	public String toString() {
		return "HotelPro [rooms=" + Arrays.toString(rooms) + "]";
	}




	public HotelPro(Room[][] rooms) {
		this.rooms = rooms;
	}




	public Room[][] getRooms() {
		return rooms;
	}




	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

	// (i - 2) == 200 ~ 520호실을 표현하려면 i가 2부터 시작해야함, ex) rooms[0 ... 3]
	// (j - 1) == 각 층의 첫 객실이 1호실인 것을 표현하기위해 j는 1부터 시작함.
	// if (rooms[i - 2][j - 1] == null) 이 문장을 컴파일러가 if (rooms[0][0] == null) 이렇게 인식하도록.
	// if (j == 20) 20은 10으로 나누어떨어져서 표현이 힘들어서 따로 if문을 주었음.
	// 날짜별로 빈객실이 보이게 해야할듯 함.
	public int emptyRooms() {
		int count = 0;
		for (int i = 2; i < rooms.length + 2; i++) {
			System.out.printf("[%d층]\n", i);
			for (int j = 1; j <= rooms[i - 2].length; j++) {
				if (rooms[i - 2][j - 1] == null) {
					count++;
						System.out.printf("□%d%02d호□ ", i, j);
				} else {
					System.out.printf("■%d%02d호■ ", i, j);
				}
			}
			System.out.println();
		}
		return count;
	}
	
	public void Find() {
		System.out.println("확인할 호수를 입력해 주세요.");
		 int fn = scan.nextInt();
		 for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if(rooms[i][j] != null) {
					int rn = (i + 2)*100 + j + 1;
					if(rn == fn) {
						System.out.println(rooms[i][j]);
					}else {
						System.out.println("빈방입니다.");
					}
				} 
			}
		}
	}
	
	
	
	
}

class Manager {
	@Override
	public String toString() {
		return "Manager [hotelPro=" + Arrays.toString(hotelPro) + "]";
	}

	Scanner scan = new Scanner(System.in);
	private HotelPro[] hotelPro = new HotelPro[30];
	

	public HotelPro[] getHotelPro() {
		return hotelPro;
	}

	public void setHotelPro(HotelPro[] hotelPro) {
		this.hotelPro = hotelPro;
	}
	
	public void makeRooms() {
		for (int i = 0; i < hotelPro.length; i++) {
			hotelPro[i] = new HotelPro(new Room[4][20]);
		}
	}
	
	public Customer modifyByName(String name) {
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						if(hotelPro[i].getRooms()[j][k].getCustomers().getName().equals(name)) {
								return hotelPro[i].getRooms()[j][k].getCustomers();
						}
					}
				}
			}
		}
		return null;
	}
	
	public Customer modifyByPhoneNum(String phoneNum) {
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						if(hotelPro[i].getRooms()[j][k].getCustomers().getPhoneNum().equals(phoneNum)) {
								return hotelPro[i].getRooms()[j][k].getCustomers();
						}
					}
				}
			}
		}
		return null;
	}
	
	public void findByPhoneNum (String phoneNum) {
		Loop1 :
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						if(hotelPro[i].getRooms()[j][k].getCustomers().getPhoneNum().equals(phoneNum)) {
								System.out.print(hotelPro[i].getRooms()[j][k].getCustomers());
								if (( j + 2) * 100 + k + 1 % 2 == 0) {
									System.out.println(" 객실정보 : " + (( j + 2) * 100 + k + 1) + "호실(더블룸)");
								} else {
									System.out.println(" 객실정보 : " + (( j + 2) * 100 + k + 1) + "호실(싱글룸)");
								}
								break Loop1;
						}
					}
				}
			}
		}
	}
	
	public void findByName (String Name) {
		Loop1 :
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						if(hotelPro[i].getRooms()[j][k].getCustomers().getName().equals(Name)) {
								System.out.print(hotelPro[i].getRooms()[j][k].getCustomers());
								if (( j + 2) * 100 + k + 1 % 2 == 0) {
									System.out.println(" " + (( j + 2) * 100 + k + 1) + "호실(더블룸)");
								} else {
									System.out.println(" " + (( j + 2) * 100 + k + 1) + "호실(싱글룸)");
								}
								break Loop1;
						}
					}
				}
			}
		}
	}
	
	public void checkOutHotel(String name, int roomNum) {
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						int rn = (j + 2) * 100 + k + 1;
						if(rn == roomNum) {
							hotelPro[i].getRooms()[j][k] = null;
						} 
					} 
				}
			}	
		}
		
	}
	
	public boolean checkUserInfo(String name, int roomNum) {
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						int rn = (j + 2) * 100 + k + 1;
						if(hotelPro[i].getRooms()[j][k].getCustomers().getName().equals(name) && rn == roomNum) {
							return true;
						} 
					} 
				}
			}	
		}
		return false;
	}
}


public class HotelTestKKY{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Manager m = new Manager();
		m.makeRooms();
		while (true) {
			System.out.println("메뉴 창 펴기 : 0번");
			int menu = scan.nextInt();
			if (menu != 0) {
				continue;
			}
			System.out.println("================================");
			System.out.println("  1번 : 예약 하기         2번 : 객실 현황");
			System.out.println("--------------------------------");
			System.out.println("3번 : 객실 정보 조회    4번 : 체크 아웃 처리 ");
			System.out.println("--------------------------------");
			System.out.println("5번 : 고객 정보 조회    6번 : 고객 정보 수정 ");
			System.out.println("================================");
			System.out.println("메뉴번호 외 숫자를 누르면 프로그램 종료.");
			int num = scan.nextInt();
			switch (num) {
			case 1:
				Room r = new Room();
				Customer c = new Customer();
				c.setCheckIn(c.checkIn());
				c.setCheckOut(c.checkOut());
				System.out.println("예약자 성함을 입력하세요.");
				String csName = scan.next();
				c.setName(csName);
				System.out.println("예약자 전화번호을 입력하세요.");
				String phoneNum = scan.next();
				c.setPhoneNum(phoneNum);
				int csRoomNum = r.assignRooms();
				m.getHotelPro()[c.getCheckIn().getDay() - 1].getRooms()[csRoomNum / 100 - 2][csRoomNum % 100 - 1] = new Room(c);
				System.out.printf("%s님 %d호에 배정되었습니다.\n", csName, csRoomNum);
				System.out.println(c);
				int days = (int) c.howManyDays();
				for (int i = 0; i < days; i++) {
					m.getHotelPro()[(c.getCheckIn().getDay() - 1) + i].getRooms()[csRoomNum / 100 - 2][csRoomNum % 100 - 1] = new Room(c);
				}
				continue;
			case 2:
				System.out.println("예약현황을 확인 하고싶은 일자(DAY)를 입력해주세요.");
				int dayNum = scan.nextInt();
				System.out.println("==========");
				System.out.printf("%d일 객실 현황\n", dayNum);
				System.out.println("==========");
				int emptyRoomNum = m.getHotelPro()[dayNum - 1].emptyRooms();
				System.out.printf("%d일 빈 객실 수 : %d객실\n", dayNum, emptyRoomNum);
				continue;
			case 3:
				System.out.println("확인할 일자(DAY)를 입력해주세요.");
				int dayNum2 = scan.nextInt();
				m.getHotelPro()[dayNum2 - 1].Find();
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
					m.findByName(name3);
				} else if (button == 2) {
					System.out.println("전화번호를 입력해주세요.");
					String phoneNum3 = scan.next();
					m.findByPhoneNum(phoneNum3);
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
				}
				if (c3 == null) {
					System.out.println("예약자 정보가 없습니다.");
					break;
				}
				System.out.println(c3);
				System.out.println("===================================");
				System.out.println("  1번 :  이름 변경       2번 : 전화번호 변경");
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
					c3.setCheckIn(c3.checkIn());
					System.out.println(c3);
					break;
				case 4:
					System.out.println("수정할 체크아웃 날짜를 입력하세요.");
					c3.setCheckOut(c3.checkOut());
					System.out.println(c3);
					break;
				default :
					break;
				}
			}
		}
	}
}