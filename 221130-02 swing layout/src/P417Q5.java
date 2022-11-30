import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class BMI extends JFrame implements ActionListener {
	final static float SORT_NUM = 0.25F;
	private JLabel lb2;
	private JLabel lb3;
	private JLabel lb4;
	public BMI() {
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		JPanel pn4 = new JPanel();
		JPanel pn5 = new JPanel();
		
		BoxLayout box = new BoxLayout(pn1, BoxLayout.Y_AXIS);
		pn1.setLayout(box);
//		pn1.add(pn2);
//		pn1.add(pn3);
//		pn1.add(pn4);
//		pn1.add(pn5);
		
		
		
		JButton btn = new JButton("BMI 확인 하기");
		JTextField tf1 = new JTextField(8);
		JTextField tf2 = new JTextField(8);
		JLabel lb1 = new JLabel("나의 BMI 지수는 얼마나 될까? ");
		lb2 = new JLabel("나의 체중(kg) : ");
		lb3 = new JLabel("나의 키(cm) : ");
		lb4 = new JLabel("0");
		
//		pn2.setAlignmentX(SORT_NUM);
//		pn3.setAlignmentX(SORT_NUM);
//		pn4.setAlignmentX(SORT_NUM);
//		pn5.setAlignmentX(SORT_NUM);

//		btn.setAlignmentX(SORT_NUM);
//		tf1.setAlignmentX(SORT_NUM);
//		tf2.setAlignmentX(SORT_NUM);
//		lb1.setAlignmentX(SORT_NUM);
//		lb2.setAlignmentX(SORT_NUM);
//		lb3.setAlignmentX(SORT_NUM);
//		lb4.setAlignmentX(SORT_NUM);
		
		
		btn.addActionListener(this);
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		
//		pn5.add(btn);
//		pn5.add(lb4);
//		pn4.add(lb3);
//		pn4.add(tf2);
//		pn3.add(lb2);
//		pn3.add(tf1);
//		pn2.add(lb1);
		
		pn1.add(lb3);
		pn1.add(tf2);
		pn1.add(lb2);
		pn1.add(tf1);
		pn1.add(lb1);
		pn1.add(btn);
		pn1.add(lb4);
		add(pn1);
		
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void showGUI() {
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		try {
			int kg = Integer.parseInt(lb2.getText());
			int cm = Integer.parseInt(lb3.getText());
			double cm2 = Math.pow(cm, 2);
			double bmi = (cm2 / 100 + cm2 % 100);
			lb4.setText(String.valueOf(bmi));
//		} catch (Exception e2) {
//			System.out.println("정수를 입력해주세요.");
//		}
	}
}
public class P417Q5 {
	public static void main(String[] args) {
		new BMI().showGUI();
	}
}
