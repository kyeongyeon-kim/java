import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ColorLayout extends JFrame {
	 
	public ColorLayout() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		JPanel pn4 = new JPanel();
		JPanel pn5 = new JPanel();
		
		JLabel lb1 = new JLabel("Red");
		JLabel lb2 = new JLabel("Yellow");
		JLabel lb3 = new JLabel("Green");
		JLabel lb4 = new JLabel("Blue");
		
		pn1.setPreferredSize(new Dimension(400, 40));
		pn1.add(lb1);
		pn1.add(lb2);
		pn1.add(lb3);
		pn1.add(lb4);
		
		JPanel color1 = new JPanel();
		color1.setBackground(Color.RED);
		color1.setPreferredSize(new Dimension(75, 75));
		pn2.add(color1);
		
		JPanel color2 = new JPanel();
		color2.setBackground(Color.YELLOW);
		color2.setPreferredSize(new Dimension(75, 75));
		pn3.add(color2);
		
		JPanel color3 = new JPanel();
		color3.setBackground(Color.GREEN);
		color3.setPreferredSize(new Dimension(75, 75));
		pn4.add(color3);
		
		JPanel color4 = new JPanel();
		color4.setBackground(Color.BLUE);
		color4.setPreferredSize(new Dimension(75, 75));
		pn5.add(color4);
		
		add(pn1);
		add(pn2);
		add(pn3);
		add(pn4);
		add(pn5);
		
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
}
public class P416 {
	public static void main(String[] args) {
		new ColorLayout().showGUI();
	}

}
