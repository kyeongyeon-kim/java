import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class FirstFrame extends JFrame implements ActionListener {
	private File name = new File("C:\\myfolder\\userName.txt");
	private File phoneNum = new File("C:\\myfolder\\userPhoneNum.txt");
	private JTable table;
	private DefaultTableModel model;

	public FirstFrame() {
		JMenu m = new JMenu("관리");
		JMenuItem insert = new JMenuItem("추가");
		JMenuItem remove = new JMenuItem("삭제");
		JMenuBar mb = new JMenuBar();
		m.add(insert);
		m.add(remove);
		mb.add(m);
		setJMenuBar(mb);
		insert.addActionListener(this);
		remove.addActionListener(this);
		
		JButton closeBtn = new JButton("종료");
		closeBtn.setBounds(150, 150, 60, 40);
		closeBtn.addActionListener(new ActionListener() {
			
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				writeFile(name, phoneNum);
			}
		});
		add(closeBtn);
		
		JPanel p = new JPanel();
		JTextField tf = new JTextField(20);
	    JButton serach = new JButton("검색");
	    add(p, "South");
	    String[] comboName = { " ALL", "이름", "전화번호"};
	 
	    JComboBox combo = new JComboBox(comboName);
	    combo.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				TableModel tm = table.getModel();
				Object str = combo.getSelectedItem();
				int row = 0;
				int column = 0;
				Color c = Color.YELLOW;
				TableCellRenderer render = table.getCellRenderer(row, column);
				if (str == "ALL") {
					Loop1 :
					for (int i = 0; i < tm.getRowCount(); i++) {
						for (int j = 0; j < tm.getColumnCount(); j++) {
							Object obj = model.getValueAt(i, j);
							if (obj.equals(tf.getText())) {
								((JComponent) render).setBackground(c);
							}
						}
					}
				} else if (str == "이름") {
					for (int i = 0; i < tm.getRowCount(); i++) {
						Object obj = model.getValueAt(i, 0);
						if (obj.equals(tf.getText())) {
							((JComponent) render).setBackground(c);
						}
					}
				} else if (str == "전화번호") {
					for (int i = 0; i < tm.getRowCount(); i++) {
						Object obj = model.getValueAt(i, 1);
						if (obj.equals(tf.getText())) {
							((JComponent) render).setBackground(c);
						}
					}
				}
			}
		});
	   
		
		String[] header = { "이름", "전화번호" };
		model = new DefaultTableModel(header, 0);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		
		getContentPane().add(scrollPane, "Center");
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 250, 400, 50);
		panel.setLayout(null);
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setBackground(Color.yellow);
        panel.add(combo);
        panel.add(tf);
        panel.add(serach);
		
		readFile(name,phoneNum);

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
		FirstFrame f = new FirstFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("추가")) {
			UserInfoIO data = new UserInfoIO();
			addStringRow(data);
		} else if (command.equals("삭제")) {
			clearRow();
		}
	}

	private void addStringRow(UserInfoIO data) {
		String[] inputStr = new String[2];
		String inputName = data.getNameBox().getText();
		String inputPhoneNum = data.getPhoneNumBox().getText();
		inputStr[0] = inputName;
		inputStr[1] = inputPhoneNum;
		model.addRow(inputStr);
	}

	private void clearRow() {
		int index = table.getSelectedRow();
		if (index < 0) {
//	            showMessage("삭제할 행을 선택해 주세요.");
		} else {
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
