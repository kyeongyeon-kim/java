import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main extends JFrame {
	public Main() {
		JTextArea ta = new JTextArea();
		JScrollPane scroll = new JScrollPane(ta);
		add(scroll);

		JPanel pnlSouth = new JPanel();
		JButton btnReset = new JButton("새 파일");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		JButton btnOutput = new JButton("저장하기");
		btnOutput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int option = chooser.showSaveDialog(Main.this);

				if (option == JFileChooser.APPROVE_OPTION) {
					File select = chooser.getSelectedFile();
					writeTextToFile(select, ta.getText());
				}
			}
		});
		JButton btnInput = new JButton("불러오기");
		btnInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int option = chooser.showOpenDialog(Main.this);

				if (option == JFileChooser.APPROVE_OPTION) {
					File select = chooser.getSelectedFile();
					String text = readTextFromFile(select);
					ta.setText(text);
				}
			}

		});
		pnlSouth.add(btnReset);
		pnlSouth.add(btnOutput);
		pnlSouth.add(btnInput);
		add(pnlSouth, "South");

		setSize(500, 500);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private String readTextFromFile(File select) {
		StringBuilder sb = new StringBuilder();
		try {
			BufferedReader br = new BufferedReader(new FileReader(select));
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

	private void writeTextToFile(File dest, String text) {
		try (PrintWriter pw = new PrintWriter(dest);) {
			pw.print(text);
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Main();
	}
}
