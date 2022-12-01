import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class TestImage extends JFrame implements ActionListener {
	private ImageIcon imageIcon;
	private ImageIcon imageIcon2;
	private JLabel lbl;
	private JButton btn;

	public TestImage() {
		JPanel pnl = new JPanel();
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		ClassLoader classLoader = getClass().getClassLoader();
		Image image = kit.getImage(classLoader.getResource("춘식6.png"));
		
		imageIcon = new ImageIcon(image);
		imageIcon2 = new ImageIcon("춘식16.png");
		
		lbl = new JLabel();
		lbl.setIcon(imageIcon);
		btn = new JButton(imageIcon);
		btn.addActionListener(this);
		
		pnl.add(lbl);
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		lbl.setIcon(imageIcon2);
		btn.setIcon(imageIcon2);
	}
}

public class Main3 {
	public static void main(String[] args) {
		new TestImage();
	}
}
