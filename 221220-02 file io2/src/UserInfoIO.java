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
	private File nameDB;
	private File phoneDB;
	private JTextField nameBox;
	private JTextField phoneNumBox;

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

	public UserInfoIO() {
		setLayout(null);
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(9, 21, 57, 15);
		add(nameLabel);
		JLabel phoneLabel = new JLabel("전화번호");
		phoneLabel.setBounds(9, 71, 57, 15);
		add(phoneLabel);
		setModal(true);

		nameBox = new JTextField();
		nameBox.setBounds(76, 18, 96, 21);
		add(nameBox);
		nameBox.setColumns(10);

		phoneNumBox = new JTextField();
		phoneNumBox.setBounds(76, 68, 96, 21);
		add(phoneNumBox);
		phoneNumBox.setColumns(10);

		nameDB = new File("D:\\myfolder\\userName.txt");
		phoneDB = new File("D:\\myfolder\\userPhoneNum.txt");

		JButton inputBtn = new JButton("확인");
		inputBtn.setBounds(40, 116, 97, 23);
		add(inputBtn);
		inputBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				UserDB.NAME.add(nameBox.getText());
				UserDB.PHONE.add(phoneNumBox.getText());
				dispose();
			}
		});
		setLocationRelativeTo(null);
		setSize(200, 200);
		setVisible(true);

	}

	public void writeFile() {
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;

		try {
			bw1 = new BufferedWriter(new FileWriter(nameDB));
			bw2 = new BufferedWriter(new FileWriter(phoneDB));
			bw1.write(nameBox.getText());
			bw2.write(phoneNumBox.getText());

		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (bw1 != null) {
				try {
					bw1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (bw2 != null) {
				try {
					bw2.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}