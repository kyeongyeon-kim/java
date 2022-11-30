import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class ColorBoard extends JFrame {
	private Button[] btns = new Button[20];
	
	public ColorBoard () {
		GridLayout gird = new GridLayout(4, 5);
		setLayout(gird);
		
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new Button("" + i);
		}
		
		for (int i = 0; i < btns.length; i++) {
			this.btns[i].setBackground(randomColor());
			add(btns[i]);
		}
		
		setSize(1000, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
	public Color randomColor() {
		int red = (int)(Math.random() * 256);
		int green = (int)(Math.random() * 256);
		int blue = (int)(Math.random() * 256);
		return new Color(red, green, blue);
	}
}
public class P417Q7 {
	
	public static void main(String[] args) {
		new ColorBoard().showGUI();
	}

}
