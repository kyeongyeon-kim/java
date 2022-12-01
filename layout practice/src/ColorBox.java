import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Color20 extends JFrame implements ActionListener{
	Random ran = new Random();
	JButton colorButton[] = new JButton[20];
	private JPanel pnl;

	public Color20() {
		pnl = new JPanel();
		GridLayout grid = new GridLayout(4,5);
		pnl.setLayout(grid);
		
		for (int i = 0; i < 20; i++) {
			colorButton[i] = new JButton(String.valueOf(i));
			int ran1 = ran.nextInt(256);
			int ran2 = ran.nextInt(256);
			int ran3 = ran.nextInt(256);
			colorButton[i].setBackground(new Color(ran1, ran2, ran3));
			pnl.add(colorButton[i]);
		}
		add(pnl);
		
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {	

	}
	public void showGUI() {
		setVisible(true);
	}
}

public class ColorBox {
	public static void main(String[] args) {
		new Color20().showGUI();
	}
}