import java.util.Arrays;
import java.util.Scanner;

class Manager {
	@Override
	public String toString() {
		return "Manager [hotelPro=" + Arrays.toString(hotelPro) + "]";
	}

	Scanner scan = new Scanner(System.in);
	private Hotel[] hotelPro = new Hotel[30];
	

	public Hotel[] getHotelPro() {
		return hotelPro;
	}

	public void setHotelPro(Hotel[] hotelPro) {
		this.hotelPro = hotelPro;
	}
	
	public void makeRooms() {
		for (int i = 0; i < hotelPro.length; i++) {
			hotelPro[i] = new Hotel(new Room[4][20]);
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
	
	public int findByPhoneNum (String phoneNum) {
		Loop1 :
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						if(hotelPro[i].getRooms()[j][k].getCustomers().getPhoneNum().equals(phoneNum)) {
								System.out.print(hotelPro[i].getRooms()[j][k].getCustomers());
								if (( j + 2) * 100 + k + 1 % 2 == 0) {
									System.out.println(" 객실정보 : " + (( j + 2) * 100 + k + 1) + "호실(싱글룸)");
									return 1;
								} else {
									System.out.println(" 객실정보 : " + (( j + 2) * 100 + k + 1) + "호실(더블룸)");
									return 1;
								}
						}
					}
				}
			}
		}
	return -1;
	}
	
	public int findByName (String Name) {
		for (int i = 0; i < hotelPro.length; i++) {
			for (int j = 0; j < hotelPro[i].getRooms().length; j++) {
				for (int k = 0; k < hotelPro[i].getRooms()[j].length; k++) {
					if(hotelPro[i].getRooms()[j][k] != null) {
						if(hotelPro[i].getRooms()[j][k].getCustomers().getName().equals(Name)) {
								System.out.print(hotelPro[i].getRooms()[j][k].getCustomers());
								if (( j + 2) * 100 + k + 1 % 2 == 0) {
									System.out.println(" 객실정보 : " + (( j + 2) * 100 + k + 1) + "호실(싱글룸)");
									return 1;
								} else {
									System.out.println(" 객실정보 : " + (( j + 2) * 100 + k + 1) + "호실(더블룸)");
									return 1;
								}
						}
					}
				}
			}
		}
		return -1;
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