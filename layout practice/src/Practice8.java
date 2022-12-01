import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Frame8 extends JFrame implements ActionListener{
	private JButton[] btnArrs;
	private JButton btnClear;
	private JTextField tf;

	public Frame8() {
		super("Phone Number");
		JPanel pnl = new JPanel();
		pnl.setLayout(new BorderLayout());
		JPanel pnlCenter = new JPanel();
		pnlCenter.setLayout(new GridLayout(5, 3));

		
		tf = new JTextField(10);
		
		btnArrs = new JButton[15];
		for (int i = 0; i < btnArrs.length; i++) {
			btnArrs[i] = new JButton();
			if (i > 8) {
				if(i == 9) {
					btnArrs[i].setText("*");
				} else if (i == 10) {
					btnArrs[i].setText("0");
				} else if (i == 11) {
					btnArrs[i].setText("#");
				} else if (i == 12) {
					btnArrs[i].setText("send");
				} else if (i == 14) {
					btnArrs[i].setText("end");
				}
			} else {
				btnArrs[i].setText(String.valueOf(i + 1));
			}
			pnlCenter.add(btnArrs[i]);
			btnArrs[i].addActionListener(this);
		}
		
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(this);
		tf.addActionListener(this);
		
		pnl.add(tf, "North");
		pnl.add(pnlCenter, "Center");
		pnl.add(btnClear, "East");
		
		add(pnl);
		
		setSize(500,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object command = e.getSource();
		for (int i = 0; i < btnArrs.length - 3; i++) {
			if (command == btnArrs[i]) {
				String tempTf = tf.getText();
				String tempBtn = btnArrs[i].getText();
				tf.setText(tempTf + tempBtn);
			}
		}
		if (command == btnClear) {
			tf.setText("");
		}
		if (command == tf) {
			tf.setText("");
		}
		
	}
}

public class Practice8 {
	public static void main(String[] args) {
		new Frame8().showGUI();
	}
}
