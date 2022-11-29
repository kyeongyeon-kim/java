import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyClickEventListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JPanel pn1 = new JPanel();
		int colorNum1 = (int)(Math.random() * 255) + 1;
		int colorNum2 = (int)(Math.random() * 255) + 1;
		int colorNum3 = (int)(Math.random() * 255) + 1;
		pn1.setBackground(new Color(colorNum1, colorNum2, colorNum3));
	}
	
}


public class ColorFrame extends JFrame {
	
	public ColorFrame() {
		super("색이 있는 창");
		
		
		// JPanel == 컨테이너 역할을 하는 도화지
		JPanel pn1 = new JPanel();
		
		pn1.setBackground(new Color(0, 0, 0));
		add(pn1);
		JButton btn = new JButton("색 바꾸기");
		pn1.add(btn);
		Container container = getContentPane();
		ActionListener listener = new MyClickEventListener();
		btn.addActionListener(listener);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public void showGUI() {
		setVisible(true);
	}

	public static void main(String[] args) {
		new ColorFrame().showGUI();
	}
}
