import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Frame9 extends JFrame {
	public Frame9() {
		super("My Frame");
		JPanel pnl = new JPanel();
		pnl.setLayout(null);
		
		JLabel[] lblArr = new JLabel[30];
		for (int i = 0; i < lblArr.length; i++) {
			int num = (int) (Math.random() * lblArr.length);
			lblArr[i] = new JLabel(String.valueOf(num));
			pnl.add(lblArr[i]);
			int x = (int) (Math.random() * 500);
			int y = (int) (Math.random() * 200);
			lblArr[i].setBounds(x, y, 15, 15);
		}
		
		add(pnl);
		
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
}

public class Practice9 {
	public static void main(String[] args) {
		new Frame9().showGUI();
	}
}
