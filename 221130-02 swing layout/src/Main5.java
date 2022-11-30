import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class TestGridLayout extends JFrame {
	public TestGridLayout() {
		// GridLayout 3행 3열에 버튼 9개를 추가
		// 왼쪽 위부터 차례대로 추가
		GridLayout grid = new GridLayout(3, 3);
		// 가로 여백
		grid.setHgap(5);
		// 세로 여백
		grid.setVgap(10);
		setLayout(grid);
		
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		add(new JButton("버튼"));
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
}
public class Main5 {
	public static void main(String[] args) {
		new TestGridLayout().showGUI();
	}
}
