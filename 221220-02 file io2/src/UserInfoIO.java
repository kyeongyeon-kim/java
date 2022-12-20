import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

class UserInfoIO extends JDialog {

	private JTextField nameBox;
	private JTextField phoneNumBox;
	private JLabel lbl;

	public JTextField getNameBox() {
		return nameBox;
	}

	public void setNameBox(JTextField nameBox) {
		this.nameBox = nameBox;
	}

	public JTextField getPhoneNumBox() {
		return phoneNumBox;
	}

	public void setPhoneNumBox(JTextField phoneNumBox) {
		this.phoneNumBox = phoneNumBox;
	}

	private void correctInputAfterClose() {
//		Integer convertInt1 = Integer.valueOf(nameBox.getText());
//		Integer convertInt2 = Integer.valueOf(phoneNumBox.getText());
//		if (nameBox.getText().contains(" ") || phoneNumBox.getText().contains(" ")) {
//			lbl.setText("공백을 넣을 수 없습니다.");
//		} else if (convertInt1 instanceof Integer) {
//			lbl.setText("이름란에 숫자를 넣을 수 없습니다.");
//		} else if (!(convertInt2 instanceof Integer)) {
//			lbl.setText("전화번호란에 문자를 넣을 수 없습니다.");
//		} else {
//			dispose();
//		}
		dispose();
	}

	public UserInfoIO() {
		setLayout(null);
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(9, 21, 57, 15);
		add(nameLabel);
		JLabel phoneLabel = new JLabel("전화번호");
		phoneLabel.setBounds(9, 71, 57, 15);
		add(phoneLabel);
		setModal(true);

		lbl = new JLabel("");
		lbl.setBounds(76, 38, 100, 21);
		add(lbl);

		nameBox = new JTextField();
		nameBox.setBounds(76, 18, 96, 21);
		add(nameBox);
		nameBox.setColumns(10);

		phoneNumBox = new JTextField();
		phoneNumBox.setBounds(76, 68, 96, 21);
		add(phoneNumBox);
		phoneNumBox.setColumns(10);

		JButton inputBtn = new JButton("확인");
		inputBtn.setBounds(40, 116, 97, 23);
		add(inputBtn);
		inputBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				correctInputAfterClose();
			}
		});
		setLocationRelativeTo(null);
		setSize(200, 200);
		setVisible(true);

	}

}