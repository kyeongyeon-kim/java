import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MovingLabel extends JFrame {
	private int x = 100;
	private int y = 100;
	
	public MovingLabel() {
		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("O");
		
		pnl.setLayout(null);
		lbl.setBounds(x, y, 20, 20);
		// 패널에게 상호작용을 할 수 있도록 하는 법(포커스가 가능하게)
		pnl.setFocusable(true);
		
		pnl.add(lbl);
		add(pnl);
		
		
		pnl.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int code = e.getKeyCode();
				switch (code) {
				case KeyEvent.VK_UP:
					y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					y += 10;
					break;
				case KeyEvent.VK_LEFT:
					x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					x += 10;
					break;
				}
				lbl.setLocation(x, y);
			}
		});
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Main2 {
	public static void main(String[] args) {
		new MovingLabel();
	}
}
