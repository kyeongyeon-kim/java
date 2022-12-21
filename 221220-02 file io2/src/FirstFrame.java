import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


class UserInfoIO extends JDialog {

	private JTextField nameBox;
	private JTextField phoneNumBox;
	private JLabel lbl;

	public JTextField getNameBox() {
		return nameBox;
	}

	public JTextField getPhoneNumBox() {
		return phoneNumBox;
	}

	public UserInfoIO() {
		getContentPane().setLayout(null);
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setBounds(9, 42, 57, 15);
		getContentPane().add(nameLabel);
		JLabel phoneLabel = new JLabel("전화번호");
		phoneLabel.setBounds(9, 71, 57, 15);
		getContentPane().add(phoneLabel);
		setModal(true);

		lbl = new JLabel("");
		lbl.setBounds(9, 96, 163, 21);
		lbl.setForeground(Color.RED);
		lbl.setFont(new Font(null, Font.PLAIN, 10));
		getContentPane().add(lbl);

		nameBox = new JTextField();
		nameBox.setBounds(76, 39, 96, 21);
		getContentPane().add(nameBox);
		nameBox.setColumns(10);

		phoneNumBox = new JTextField();
		phoneNumBox.setBounds(76, 68, 96, 21);
		getContentPane().add(phoneNumBox);
		phoneNumBox.setColumns(10);

		JButton inputBtn = new JButton("확인");
		inputBtn.setBounds(40, 127, 97, 23);
		getContentPane().add(inputBtn);
		inputBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String message = correctInputAfterClose(nameBox.getText(), phoneNumBox.getText());
				if (message != null) {
					lbl.setText(message);
				} else {
					dispose();
				}
			}
		});
		setLocationRelativeTo(null);
		setSize(200, 200);
		setVisible(true);

	}
	
}
public String correctInputAfterClose(String name, String phoneNum) {
	
	if (name.contains(" ") || phoneNum.contains(" ")) {
		return "공백을 넣을 수 없습니다.";
	} else if (!isString(name)) {
		return "이름란에 숫자를 넣을 수 없습니다.";
	} else if (!isInteger(phoneNum)) {
		return "전화번호란에 문자를 넣을 수 없습니다.";
	} 
	return null;
}


public boolean isString(String str) {
	for (int i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
		if(Integer.valueOf(c) instanceof Integer) {
			return false;
		}
	}
	return true;
}

public boolean isInteger(String str) {
	for (int i = 0; i < str.length(); i++) {
		char c = str.charAt(i);
		if(!(Integer.valueOf(c) instanceof Integer)) {
			return false;
		}
	}
	return true;
}


public class FirstFrame extends JFrame implements ActionListener {
	private File name = new File("D:\\myfolder\\userName.txt");
	private File phoneNum = new File("D:\\myfolder\\userPhoneNum.txt");
	private JTable table;
	private DefaultTableModel model;
	private Object str = "ALL";
	private JTextField tf;

	public FirstFrame() {
		JMenu m = new JMenu("관리");
		JMenuItem insert = new JMenuItem("추가");
		JMenuItem remove = new JMenuItem("삭제");
		JMenuItem close = new JMenuItem("종료");
		JMenuBar mb = new JMenuBar();
		m.add(insert);
		m.add(remove);
		m.add(close);
		mb.add(m);
		setJMenuBar(mb);
		insert.addActionListener(this);
		remove.addActionListener(this);
		close.addActionListener(this);
		tf = new JTextField(20);
		
		JButton serach = new JButton("검색");
		serach.addActionListener(this);
		String[] comboName = { " ALL", "이름", "전화번호" };

		JComboBox combo = new JComboBox(comboName);
		combo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				str = combo.getSelectedItem();
			}
		});

		String[] header = { "이름", "전화번호" };
		model = new DefaultTableModel(header, 0);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);

		getContentPane().add(scrollPane, "Center");

		JPanel panel = new JPanel();
		panel.setBounds(0, 250, 400, 50);
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.ORANGE);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(combo);
		panel.add(tf);
		panel.add(serach);

		readFile(name, phoneNum);

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		// 전화번호부 프로그램
		// 사람이름 & 전화번호
		// 목록 보기
		// 추가 하기
		new FirstFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("추가")) {
			UserInfoIO data = new UserInfoIO();
			addStringRow(data);
		} else if (command.equals("삭제")) {
			selectedRemoveRow();
		} else if (command.equals("종료")) {
			writeFile(name, phoneNum);
			dispose();
		} else if (command.equals("검색")) {
			searchInfo();
		}
	}
	
	public void searchInfo() {
		TableModel tm = table.getModel();
		if (str.equals("ALL")) {
			for (int i = 0; i < tm.getRowCount(); i++) {
				for (int j = 0; j < tm.getColumnCount(); j++) {
					Object obj = model.getValueAt(i, j);
					if (obj.equals(tf.getText())) {
						table.changeSelection(i, j, false, false);
					}
				}
			}
		} else if (str.equals("이름")) {
			for (int i = 0; i < tm.getRowCount(); i++) {
				Object obj = model.getValueAt(i, 0);
				if (obj.equals(tf.getText())) {
					table.changeSelection(i, 0, false, false);
				}
			}
		} else if (str.equals("전화번호")) {
			for (int i = 0; i < tm.getRowCount(); i++) {
				Object obj = model.getValueAt(i, 1);
				if (obj.equals(tf.getText())) {
					System.out.println(obj);
					table.changeSelection(i, 1, false, false);
				}
			}
		}
	}

	public void addStringRow(UserInfoIO data) {
		String[] inputStr = new String[2];
		String inputName = data.getNameBox().getText();
		String inputPhoneNum = data.getPhoneNumBox().getText();
		inputStr[0] = inputName;
		inputStr[1] = inputPhoneNum;
		model.addRow(inputStr);
	}

	public void selectedRemoveRow() {
		int index = table.getSelectedRow();
		if (index >= 0) {
			model.removeRow(index);
		}
	}

	public void readFile(File name, File PhoneNum) {

		BufferedReader br1 = null;
		BufferedReader br2 = null;

		try {

			br1 = new BufferedReader(new FileReader(name));
			br2 = new BufferedReader(new FileReader(PhoneNum));

			StringTokenizer st1 = new StringTokenizer(br1.readLine(), " ");
			StringTokenizer st2 = new StringTokenizer(br2.readLine(), " ");

			while (st1.hasMoreTokens()) {
				String[] inputStr = new String[2];
				inputStr[0] = st1.nextToken();
				inputStr[1] = st2.nextToken();
				model.addRow(inputStr);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
	}

	public void writeFile(File name, File phoneNum) {
		TableModel tm = table.getModel();
		BufferedWriter bw1 = null;
		BufferedWriter bw2 = null;

		try {
			bw1 = new BufferedWriter(new FileWriter(name));
			bw2 = new BufferedWriter(new FileWriter(phoneNum));

			for (int i = 0; i < tm.getRowCount(); i++) {
				Object obj = model.getValueAt(i, 0);
				bw1.write((String) obj + " ");
			}
			for (int i = 0; i < tm.getRowCount(); i++) {
				Object obj = model.getValueAt(i, 1);
				bw2.write((String) obj + " ");
			}
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