
public class Car {
		private String Color;
		private int speed;
		
		public Car(String color, int speed) {
			Color = color;
			this.speed = speed;
		}
		public String getColor() {
			return Color;
		}
		public void setColor(String color) {
			Color = color;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		@Override
		public String toString() {
			return "Car [Color=" + Color + ", speed=" + speed + "]";
		}
}
