package frame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



class FirstFrame extends JFrame {
	String inputName;
	String inputAge;
	int count = 0; 
	
	class SecondFrame extends JDialog {

		public SecondFrame() {
			
			JPanel second = new JPanel();
			
			
			JPanel pn0 = new JPanel();
			JPanel pn1 = new JPanel();
			JPanel pn2 = new JPanel();
			JPanel pn3 = new JPanel();
			
			JLabel nameLb = new JLabel("이름");
			JLabel ageLb = new JLabel("나이");
			JTextField nameTf = new JTextField(8);
			JTextField ageTf = new JTextField(8);
			JButton btnOK = new JButton("확인");
			
			second.setLayout(new GridLayout(4, 1));
			
			btnOK.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					inputName = nameTf.getText();
					inputAge = ageTf.getText();
					dispose();
				}
			});
			
			pn1.add(nameLb);
			pn1.add(nameTf);
			pn2.add(ageLb);
			pn2.add(ageTf);
			pn3.add(btnOK);
			
			second.add(pn0);
			second.add(pn1);
			second.add(pn2);
			second.add(pn3);
			
			
			add(second);
			
			setModal(true);
			setSize(300, 300);
			setVisible(true);
		}
	}
	
	public FirstFrame() {
		JPanel first = new JPanel();
		JButton btn = new JButton("등록하기");
		JLabel[] showInfo = new JLabel[6];
		first.setLayout(new BoxLayout(first, BoxLayout.Y_AXIS));
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				SecondFrame second = new SecondFrame();
				String name = inputName;
				String age = inputAge;
				count++;
				showInfo[count].setText(name + "(" + age + ")"); 
			}
		});
		
		first.add(btn);
		
		for (int i = 0; i < showInfo.length; i++) {
			showInfo[i] = new JLabel("");
			first.add(showInfo[i]);
		}
		
		btn.setAlignmentX(CENTER_ALIGNMENT);
		add(first);
		
		setSize(300, 180);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Main4 {
	public static void main(String[] args) {
		new FirstFrame();
	}
}