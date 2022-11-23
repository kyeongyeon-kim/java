
public class DeskLamp {
	private boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	public String toStirng() {
		return "현재 상태는" + (isOn == true ? "켜짐" : "꺼짐");
	}
}
