import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class User {
	final static String USER_ID = "Admin";
	final static String USER_PW = "1q2w3e";
}

class Login extends JFrame implements ActionListener {
	private JTextField idBox;
	private JTextField passwordBox;
	private JLabel oX;
	
	public Login() {
		JPanel pn1 = new JPanel();
		
		idBox = new JTextField(6);
		passwordBox = new JTextField(6);
		JButton loginBtn = new JButton("로그인");
		JLabel idLabel = new JLabel("ID");
		JLabel passwordLabel = new JLabel("PASSWORD");
		oX = new JLabel("");
		
		pn1.add(idLabel);
		pn1.add(idBox);
		pn1.add(passwordLabel);
		pn1.add(passwordBox);
		pn1.add(loginBtn);
		pn1.add(oX);
		
		add(pn1);
		
		// 텍스트필드에 액션리스너를 추가해주게 되면 엔터를 누를 때에 동작하게 된다.
		idBox.addActionListener(this);
		passwordBox.addActionListener(this);
		loginBtn.addActionListener(this);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	

	public void showGUI() {
		setVisible(true);
	}
	// JTextField.getText()를 통해 사용자 입력값을 받아 올 수 있음
	// 똑같은 동작을 하는 것이라 소스를 받을 필요가 없다.
	@Override
	public void actionPerformed(ActionEvent e) {
		String inputID = idBox.getText();
		String inputPW = passwordBox.getText();
		if (inputID.equals(User.USER_ID) && inputPW.equals(User.USER_PW)) {
			System.out.println("로그인 되었습니다.");
			oX.setText("o");
		} else {
			System.out.println("아이디와 비밀번호를 다시 입력해주세요.");
			oX.setText("x");
		}
	}
}

	
	

public class Main4 {
	public static void main(String[] args) {
		new Login().showGUI();
	}
}
