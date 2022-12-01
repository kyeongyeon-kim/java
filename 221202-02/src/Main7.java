import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class LengthChanger extends JFrame implements ActionListener, ItemListener {
	private boolean is1stChoice = true;
	private JRadioButton radiomileKm;
	private JRadioButton radioKmMile;
	private JTextField tfInput;
	private JLabel lb1Result;
	
	public LengthChanger() {
		lb1Result = new JLabel("0");
	
		JPanel pn1 = new JPanel();
		radiomileKm = new JRadioButton("Mile을 Km로");
		radioKmMile = new JRadioButton("Km을 Mile로");
		pn1.add(radiomileKm);
		pn1.add(radioKmMile);
		
		radiomileKm.addItemListener(this);
		radioKmMile.addItemListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioKmMile);
		group.add(radiomileKm);
		radiomileKm.setSelected(true);
		
		
		add(pn1, "North");
		
		JPanel pn1Center = new JPanel();
		tfInput = new JTextField(10);
		JButton btn = new JButton("변환하기");
		pn1Center.add(tfInput);
		pn1Center.add(btn);
		pn1Center.add(lb1Result);
		add(pn1Center, "Center");
		
		btn.addActionListener(this);
		
		
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double number = Double.parseDouble(tfInput.getText());
		if (is1stChoice) {
			double result = number * 1.609;
			lb1Result.setText(String.valueOf(result));
		} else {
			double result = number / 1.609;
			lb1Result.setText(String.valueOf(result));
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		is1stChoice = (e.getSource() == radioKmMile);
	}
}
public class Main7 {
	public static void main(String[] args) {
		new LengthChanger();
	}

}
