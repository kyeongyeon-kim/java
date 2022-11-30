import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//flowLayout 특징 : 컴포넌트들의 나열 및 여백, 특정위치로 정렬을 해줌 (가장 쉽게 쓰는 레이아웃)
class TestFlowLayout extends JFrame {
	public TestFlowLayout() {
		FlowLayout flow = new FlowLayout();
		// setAlignment 파라미터에는 상수값을 가져와서 넣어주면 됨
		flow.setAlignment(FlowLayout.LEFT);
		// 각 컴포넌트 가로 여백 설정
		flow.setHgap(50);
		setLayout(flow);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("~~~~ 버튼3 ~~~~");
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void showGUI() {
		setVisible(true);
	}
}

public class Main3 {
	public static void main(String[] args) {
		 new TestFlowLayout().showGUI();
	}
}
