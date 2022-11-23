// 박스
// 가로
// 세로
// 높이

// 필드를 private하게 선언하고
// 각 필드에 대한 public한 접근/설정자(getter/setter) 작성하기
public class Box {
	private int length;
	private int width;
	private int height;
	
	public int getLength() { //getter
		return length;
	}
	public void setLength(int l) {//setter
		length = l;
	}
	public int getWidth() { //getter
		return width;
	}
	public void setWidth(int w) {//setter
		width = w;
	}
	public int getHeight() {//getter
		return height;
	}
	public void setHeight(int h) {//setter
		height = h;
	}
	public int getVolume() {
		return length * width * height;
	}
}
