import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ChangeFrame extends JFrame {
	
	public ChangeFrame() {
		JPanel pn1 = new JPanel();
		pn1.setPreferredSize(new Dimension(400, 400));
		CardLayout cardLayout = new CardLayout();
		pn1.setLayout(cardLayout);
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		ClassLoader classLoader = getClass().getClassLoader();
		Image image = kit.getImage(classLoader.getResource("춘식6.png"));
		Image image2 = kit.getImage(classLoader.getResource("춘식16.png"));
		
		ImageIcon imageIcon = new ImageIcon(image);
		ImageIcon imageIcon2 = new ImageIcon(image2);
		
		JLabel lbl1 = new JLabel();
		lbl1.setIcon(imageIcon);
		JLabel lbl2 = new JLabel();
		lbl2.setIcon(imageIcon2);
		
		pn1.add(lbl1);
		pn1.add(lbl2);
		
		add(pn1);
		
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl1.setIcon(imageIcon2);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lbl1.setIcon(imageIcon);
			}
		});
		
		
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class Main4 {
	public static void main(String[] args) {
		new ChangeFrame();
	}
}
