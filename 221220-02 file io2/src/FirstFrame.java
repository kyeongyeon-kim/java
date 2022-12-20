import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;

public class FirstFrame extends JFrame implements ActionListener {

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
       
		

		String[] header = { "이름", "전화번호" };
		model = new DefaultTableModel(header, 10);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);

		getContentPane().add(scrollPane, "Center");
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(null);

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
			new UserInfoIO();
			String[] inputStr = new String[2];
			inputStr[0] = UserDB.NAME.get(UserDB.NAME.size() - 1);
			inputStr[1] = UserDB.PHONE.get(UserDB.PHONE.size() - 1);
			model.addRow(inputStr);
		} else if (command.equals("삭제")) {
			System.out.println("미구현");
		}
	}
}
