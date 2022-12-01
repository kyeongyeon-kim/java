import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class TestTabPane extends JFrame {
	public TestTabPane() {
		// tab활용
		JTabbedPane tabPane = new JTabbedPane();
		JPanel pn1First = new JPanel();
		pn1First.setBackground(Color.RED);
		JPanel pn1Second = new JPanel();
		pn1Second.setBackground(Color.GREEN);
		
		tabPane.add(pn1First, "첫번째 탭");
		tabPane.add(pn1Second, "두번째 탭");
		
		add(tabPane);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}

}
public class Main2 {

	public static void main(String[] args) {
		new TestTabPane().showGUI();
	}

}
