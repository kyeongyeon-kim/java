
public class TestBox {

	public static void main(String[] args) {
		Box box1 = new Box();
		
		box1.setLength(30);
		box1.setWidth(30);
		box1.setHeight(30);
		
		System.out.println(box1.getLength());
		System.out.println(box1.getWidth());
		System.out.println(box1.getHeight());
		System.out.println(box1.getVolume());
	}

}
