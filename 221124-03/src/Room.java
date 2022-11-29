import java.util.Scanner;

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
	
	public int assignRooms(int roomType) {
		while (true) {
			switch(roomType) {
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