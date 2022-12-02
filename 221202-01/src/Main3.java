import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class ClickMe3 extends JFrame {
	private Random ran = new Random();
	
	public ClickMe3() {

		JPanel pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setPreferredSize(new Dimension(500, 500));
		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);
		
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn.setLocation(ran.nextInt(400), ran.nextInt(400));
			}
			
		});
		
		pn1.add(btn);
		
		add(pn1);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class Main3 {
	public static void main(String[] args) {
		new ClickMe3();
		// 인스턴스 접근 후 생성 가능
//		MouseAdapter adapter = frame.new MyMouseAdapter();
	}

}
