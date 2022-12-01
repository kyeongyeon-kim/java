import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class pfram03 extends JFrame {
	public pfram03() {
		JPanel pnl = new JPanel();
		add(pnl);
		
		Box Hello = Box.createVerticalBox();
		Hello.setAlignmentX(0.5F);
		Box mainBox = Box.createHorizontalBox();
		mainBox.setAlignmentX(0.5F);
		
		Hello.add(new JLabel("자바호텔에 오신것을 환영합니다 숙박일수를 입력하세요"));
		mainBox.add(Box.createGlue());
		mainBox.add(new JButton("1일"));
		mainBox.add(Box.createHorizontalStrut(7));
		mainBox.add(new JButton("2일"));
		mainBox.add(Box.createHorizontalStrut(7));
		mainBox.add(new JButton("3일"));
		mainBox.add(Box.createHorizontalStrut(7));
		mainBox.add(new JButton("4일"));
		mainBox.add(Box.createHorizontalStrut(7));
		mainBox.add(new JButton("5일"));
		mainBox.add(Box.createGlue());
		
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		
		pnl.add(Box.createGlue());
		pnl.add(Hello);
		pnl.add(Box.createVerticalStrut(30));
		pnl.add(mainBox);
		pnl.add(Box.createGlue());
	
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void showGUI() {
		setVisible(true);
	}
}
public class Practice3 {

	public static void main(String[] args) {
		new pfram03().showGUI();

	}

}
