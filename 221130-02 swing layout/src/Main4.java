import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

class TestBoxLayout extends JFrame {
	public TestBoxLayout() {
		JPanel pn1 = new JPanel();
		// 박스레이아웃 특징 : 박스를 나열하듯 컴포넌트들을 정리한다.
		// X_AXIS 가로방향 나열, Y_AXIS 세로방향 나열
		// 박스레이아웃은 파라미터에 참조가 꼭 필요함
		BoxLayout box = new BoxLayout(pn1, BoxLayout.Y_AXIS);
		pn1.setLayout(box);
		
		// 박스레이아웃은 컴포넌트들을 각각 정리 해줘야 함
		// 0.5F 가운데 0 왼쪽 1 오른쪽
		// 정수를 하나로 통일하는 것이 사용하기 편함
		JButton btn1 = new JButton("버튼1");
		btn1.setAlignmentX(0.5F);
		JButton btn2 = new JButton("버튼2");
		btn2.setAlignmentX(0.5F);
		JButton btn3 = new JButton("~~~~ 버튼3 ~~~~");
		btn3.setAlignmentX(0.5F);
		
		// 보이지않는 박스를 넣어서 중앙에 정렬
		// creatGlue 위에서 풀처럼 땡겨주고, 아래서도 땡겨주고 ~
		pn1.add(Box.createGlue());
		pn1.add(btn1);
		pn1.add(Box.createGlue());
		pn1.add(btn2);
		pn1.add(Box.createGlue());
		pn1.add(btn3);
		pn1.add(Box.createGlue());
		
		add(pn1);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void showGUI() {
		setVisible(true);
	}
}
public class Main4 {
	public static void main(String[] args) {
		new TestBoxLayout().showGUI();
	}
}
