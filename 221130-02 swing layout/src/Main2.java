import javax.swing.JButton;
import javax.swing.JFrame;

class NonLayoutFrame extends JFrame {
	public NonLayoutFrame() {
		// 자동으로 위치를 결정하던 것을 null로 > 수동
		// 레이아웃은 좌측상단이 원점이다.
		setLayout(null);
		
		JButton btn = new JButton("버튼입니다.");
		// setBounds로 새로운 원점에서 새로운 크기의 버튼을 생성할 수 있다.
		btn.setBounds(100, 150, 300, 50);
		
		JButton btn2 = new JButton("아래 버튼");
		btn2.setBounds(100, 210, 300, 50);
		
		add(btn);
		add(btn2);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void shoGUI() {
		setVisible(true);
	}
}
public class Main2 {
	public static void main(String[] args) {
		new NonLayoutFrame().shoGUI();
	}

}
