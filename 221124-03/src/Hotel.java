import java.util.Arrays;
import java.util.Scanner;

class Hotel {
	Scanner scan = new Scanner(System.in);
	private Room[][] rooms;
	
	
	
	
	// 1층 로비 , 2~5층 객실 존재, 층마다 20객실
	// 홀수면 true == 싱글룸, 짝수면 false == 더블룸

	@Override
	public String toString() {
		return "HotelPro [rooms=" + Arrays.toString(rooms) + "]";
	}




	public Hotel(Room[][] rooms) {
		this.rooms = rooms;
	}




	public Room[][] getRooms() {
		return rooms;
	}




	public void setRooms(Room[][] rooms) {
		this.rooms = rooms;
	}

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
	
	public Room Find() {
		System.out.println("확인할 호수를 입력해 주세요.");
		 int fn = scan.nextInt();
		 Loop1 :
		 for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				if(rooms[i][j] != null) {
					int rn = (i + 2)*100 + j + 1;
					if(rn == fn) {
						 return rooms[i][j];
					}
				}
			}
		}
		return null;
	}
}