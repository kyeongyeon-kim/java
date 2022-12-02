import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class InputInfoFrame extends JFrame {
	private JPanel pn1Center;
	private CardLayout card;

	public InputInfoFrame() {
		JPanel first = new JPanel();
		JPanel second = new JPanel();
		card = new CardLayout();
		pn1Center.setLayout(card);
		
		// first
		JButton nextFrameBtn = new JButton("등록하기");
		first.add(nextFrameBtn);
		
		nextFrameBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				card.show(pn1Center, "2nd");
			}
		});
		
		
		// second
		JLabel nameLbl = new JLabel("이름");
		JLabel ageLbl = new JLabel("나이");
		JTextField nameTf = new JTextField(5);
		JTextField ageTf = new JTextField(5);
		JButton btn = new JButton("확인");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		second.add(nameLbl);
		second.add(nameTf);
		second.add(ageLbl);
		second.add(ageTf);
		second.add(btn);
		
		pn1Center.add(first, "1st");
		pn1Center.add(second, "2nd");
		
		card.show(pn1Center, "1st");
		add(pn1Center);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Main4 {
	public static void main(String[] args) {
		new InputInfoFrame();
	}

}
