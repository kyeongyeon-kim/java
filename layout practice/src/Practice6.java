import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class PFrame06 extends JFrame {
	public PFrame06() {
	
		JPanel pnl = new JPanel();
		add(pnl);
		
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel Mem = new JPanel();
		Mem.add(new JLabel("회원 등록하기"));
		
		JPanel Name = new JPanel();
		Name.add(Box.createHorizontalStrut(30));
		Name.add(new JLabel("이름     "));
		Name.add(Box.createHorizontalStrut(132));
		JTextField userName = new JTextField(15);
		Name.add(userName);
		
		JPanel PW = new JPanel();
		PW.add(Box.createHorizontalStrut(30));
		PW.add(new JLabel("패서워드 "));
		PW.add(Box.createHorizontalStrut(119));
		JTextField userPW = new JTextField(15);
		PW.add(userPW);
		
		JPanel Email = new JPanel();
		Email.add(Box.createHorizontalStrut(30));
		Email.add(new JLabel("이메일 주소"));
		Email.add(Box.createHorizontalStrut(107));
		JTextField userE = new JTextField(15);
		Email.add(userE);
		
		JPanel Phone = new JPanel();
		Phone.add(Box.createHorizontalStrut(30));
		Phone.add(new JLabel("전화번호  "));
		Phone.add(Box.createHorizontalStrut(117));
		JTextField userP = new JTextField(15);
		Phone.add(userP);
		
		JPanel Registration = new JPanel();
		Registration.add(Box.createHorizontalStrut(30));
		Registration.add(new JButton("등록하기"));
		Registration.add(Box.createHorizontalStrut(10));
		Registration.add(new JButton("취소"));
		
		FlowLayout layoutN = (FlowLayout) Name.getLayout();
		layoutN.setAlignment(FlowLayout.LEFT);
		FlowLayout layoutPW = (FlowLayout) PW.getLayout();
		layoutPW.setAlignment(FlowLayout.LEFT);
		FlowLayout layoutE = (FlowLayout) Email.getLayout();
		layoutE.setAlignment(FlowLayout.LEFT);
		FlowLayout layoutP = (FlowLayout) Phone.getLayout();
		layoutP.setAlignment(FlowLayout.LEFT);
		
		
		
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		pnl.add(Box.createGlue());
		pnl.add(Mem);
		pnl.add(Name);
		pnl.add(PW);
		pnl.add(Email);
		pnl.add(Phone);
		pnl.add(Registration);
		pnl.add(Box.createGlue());
	}
	public void showGUI() {
		setVisible(true);
	}
}

public class Practice6 {

	public static void main(String[] args) {
		new PFrame06().showGUI();

	}

}
