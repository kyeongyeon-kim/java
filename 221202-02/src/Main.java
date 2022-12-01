import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TestCard extends JFrame implements ActionListener {
	private JButton btn1;
	private JButton btn2;
	private CardLayout cardLayout;
	private JPanel pn1Center;

	public TestCard() {
		JPanel pn1First = new JPanel();
		JPanel pn1Second = new JPanel();
		pn1Center = new JPanel();
		cardLayout = new CardLayout();
		pn1Center.setLayout(cardLayout);
		
		JPanel pn1North = new JPanel();
		btn1 = new JButton("첫번째 화면 보기");
		btn2 = new JButton("두번째 화면 보기");
		pn1North.add(btn1);
		pn1North.add(btn2);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		
		pn1First.add(new JLabel("첫번째 화면"));
		pn1Second.add(new JLabel("두번째 화면"));
		
		pn1Center.add(pn1First, "1st");
		pn1Center.add(pn1Second, "2nd");
		
		cardLayout.show(pn1Center, "1st");
		add(pn1Center);
		add(pn1North, "North");
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
//		if (source instanceof JButton) {
//			JButton btnSource = (JButton) source;
//			btnSource.getText().equals("첫번째 화면 보기");
//		}
		if (source == btn1) {
			cardLayout.show(pn1Center, "1st");
		} else if (source == btn2) {
			cardLayout.show(pn1Center, "2nd");
		}
	}
}
public class Main {
	public static void main(String[] args) {
		new TestCard().showGUI();
	}

}
