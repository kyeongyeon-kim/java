import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//class MyClickEventListener implements ActionListener {
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("사용자가 버튼을 눌렀습니다. 확인!");
//	}
//	
//}


public class MyFrame extends JFrame {
	public MyFrame(String title) {
		super(title);
		
		Container container = getContentPane();
		
		// FlowLayout == 레이아웃매니저 
		container.setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		JButton button2 = new JButton("버튼2");
		container.add(button);
		container.add(button2);
		// 컴포넌트들은 동작 될 때마다 이벤트라는 것이 발생함
		
		// MyClickEventListener == ActionListener때문에 업캐스팅 가능
		ActionListener listener = new MyClickEventListener();
		button.addActionListener(listener);
		button2.addActionListener(listener);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
	// 컴포넌트에 들어가 있는 컴포넌트 컨테이너
	public static void main(String[] args) {
		MyFrame f = new MyFrame("내가 상속으로 만든 창");
		f.showGUI();
		
	}

}
