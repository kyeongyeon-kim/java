import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame4 extends JFrame {
	public Frame4() {
		super("JLabel Test");
		JPanel pnl = new JPanel(); 
		pnl.setLayout(new BorderLayout());
		JPanel pnl1 = new JPanel();
		pnl1.setLayout(new FlowLayout(FlowLayout.LEFT, 27, 10));
		JPanel pnl2 = new JPanel();
		pnl2.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));
		JPanel pnlR = new JPanel();
		pnlR.setBackground(Color.RED);
		JPanel pnlY = new JPanel();
		pnlY.setBackground(Color.YELLOW);
		JPanel pnlG = new JPanel();
		pnlG.setBackground(Color.GREEN);
		JPanel pnlB = new JPanel();
		pnlB.setBackground(Color.BLUE);

		
		JLabel lblR = new JLabel("Red");
		pnlR.setPreferredSize(new Dimension(50, 50));
		JLabel lblY = new JLabel("Yellow");
		pnlY.setPreferredSize(new Dimension(50, 50));
		JLabel lblG = new JLabel("Green");
		pnlG.setPreferredSize(new Dimension(50, 50));
		JLabel lblB = new JLabel("Blue");
		pnlB.setPreferredSize(new Dimension(50, 50));
		
		pnl1.add(lblR);
		pnl1.add(lblY);
		pnl1.add(lblG);
		pnl1.add(lblB);
		
		pnl2.add(pnlR);
		pnl2.add(pnlY);
		pnl2.add(pnlG);
		pnl2.add(pnlB);
		
		pnl.add(pnl1, "North");
		pnl.add(pnl2, "Center");
	
		
		add(pnl);
		
		setSize(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
}

public class Practice4 {
	public static void main(String[] args) {
		new Frame4().showGUI();
	}
}
