import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Pframe05 extends JFrame {
	public Pframe05() {
		super("BMI 계산기");
		JPanel pnl = new JPanel();
		add(pnl);
		
		JPanel QBmi = new JPanel();
		QBmi.add(Box.createHorizontalStrut(10));
		QBmi.add(new JLabel("나의 BMI지수는 얼마나 될까?"));
		
		JPanel kg = new JPanel();
		kg.add(Box.createHorizontalStrut(10));
		kg.add(new JLabel("나의 체중(kg)"));
		kg.add(Box.createHorizontalStrut(7));
		JTextField userKg = new JTextField(20);
		kg.add(userKg);
		
		JPanel m = new JPanel();
		m.add(Box.createHorizontalStrut(10));
		m.add(new JLabel("나의 키(m)"));
		m.add(Box.createHorizontalStrut(23));
		JTextField userM = new JTextField(20);
		m.add(userM);
		
		JPanel btn = new JPanel();
		btn.add(Box.createHorizontalStrut(10));
		btn.add(new JButton("BMI 확인하기"));
		
		FlowLayout layoutQ = (FlowLayout) QBmi.getLayout();
		layoutQ.setAlignment(FlowLayout.LEFT);
		FlowLayout layoutK = (FlowLayout) kg.getLayout();
		layoutK.setAlignment(FlowLayout.LEFT);
		FlowLayout layoutM = (FlowLayout) m.getLayout();
		layoutM.setAlignment(FlowLayout.LEFT);
		FlowLayout layoutB = (FlowLayout) btn.getLayout();
		layoutB.setAlignment(FlowLayout.LEFT);
		
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		
		pnl.add(Box.createGlue());
		pnl.add(QBmi);
		pnl.add(kg);
		pnl.add(m);
		pnl.add(btn);
		pnl.add(Box.createGlue());
		
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void showGUI() {
		setVisible(true);
	}
}

public class Practice5 {

	public static void main(String[] args) {
		new Pframe05().showGUI();
	}
}
