
public class DeskLampTest {

	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
		
		myLamp.turnOn();
		System.out.println(myLamp.toStirng());
		
		myLamp.turnOff();
		System.out.println(myLamp.toStirng());
	}

}
