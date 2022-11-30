import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// swing의 기본 레이아웃 (Border 레이아웃)

class MyFrame extends JFrame {
	public MyFrame() {
		
		// 버튼을 여러개 넣을 때 추가 파라미터가 없으면, 가장 마지막 컴포넌트만 생성 됨
		// 파라미터에 문자열을 넣거나, 보더레이아웃의 상수로 접근하여 위치 설정 가능
		// 보더레이아웃이 어떨 때 많이 사용되는지? 이클립스에 이미 적용 되어있음
		JButton btn = new JButton("중앙");
		add(btn);
		
//		JButton btnNorth = new JButton("북쪽");
		// 버튼 크기 조정 가능 
		// Preferred 선호사이즈 (이렇게 만들어 줬으면 좋겠다~~)
//		btnNorth.setPreferredSize(new Dimension(100, 300));
//		add(btnNorth, "North");
		
		JPanel pn1 = new JPanel();
		pn1.add(new JButton("1번"));
		pn1.add(new JButton("2번"));
		pn1.add(new JButton("3번"));
		pn1.add(new JButton("4번"));
		add(pn1, "North");
		
		JButton btnSouth = new JButton("남쪽");
		add(btnSouth, BorderLayout.SOUTH);
		
		JButton btnWest = new JButton("서쪽");
		btnWest.setPreferredSize(new Dimension(300, 0));
		add(btnWest, "West");
		
		JButton btnEast = new JButton("동쪽");
		add(btnEast, "East");
		
		
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
			setVisible(true);
	}
		
}
public class Main {
	public static void main(String[] args) {
		new MyFrame().showGUI();
		// MyFrame f = new MyFrame();
		// f.showGUI(); 위와 같은 말
	}
}
