import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// java swing 패키지에 JFrame 창 하나를 정의해둔
		// 창은 제목이라는 속성을 갖고 있음
		// 창의 구성요소 == Component
		JFrame frame = new JFrame("처음 만든 창");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setVIsible은 프로그램이 종료되지 않고 사용자 입력을 받을 수 있음
		// GUI의 단위 == pixel (px)
		frame.setVisible(true);
		
	}

}
