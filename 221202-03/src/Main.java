import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class ColorDialog extends JDialog {
	private int r;
	private int g;
	private int b;
	private String input;
	
	public String getInput() {
		return input;
	}
	
//	other : public ColorDialog(int r, int g, int b, MainFrame main)
	public ColorDialog(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
		JTextField tfInput = new JTextField(10);
		setModal(true);
		
		
		JPanel pnlColor = new JPanel();
		pnlColor.setBackground(new Color(r, g, b));
		JButton btn = new JButton("다이얼로그 닫기");
		btn.addActionListener(new ActionListener() {
			
			// 창을 닫게 해주는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				// other : 메인프레임의 label의 글자를 설정한다.
//				main.getLbl().setText(tfInput.getText());
				input = tfInput.getText();
				dispose();
				
			}
		});
		
		pnlColor.add(tfInput);
		pnlColor.add(btn);
		add(pnlColor);
		setSize(300, 300);
		// Modal : 다른창이 떠잇을 때 상위창을 끌 수 없는 기능
		// 자바에서 그 기능을 쓰려면 JDialog를 상속해야함 (기본값 DISPOSE)
		setVisible(true);
	}
}


class MainFrame extends JFrame {
//	private JLabel lbl;
//	public JLabel getLbl() {
//		return lbl;
//	}
	
	public MainFrame() {
		JPanel pnl = new JPanel();
		JButton btn = new JButton("새창 열기");
		JTextField tfR = new JTextField(3);
		JTextField tfG = new JTextField(3);
		JTextField tfB = new JTextField(3);
		JLabel lbl = new JLabel("다이얼로그에서 입력한 문자");
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int r = Integer.valueOf(tfR.getText());
				int g = Integer.valueOf(tfG.getText());
				int b = Integer.valueOf(tfB.getText());
				ColorDialog dialog = new ColorDialog(r, g, b /*MainFrame.this*/);
				String input = dialog.getInput();
				
				lbl.setText(input);
				// modal때문에 창 닫히기전까지 해당 문장까지만 실행되고 다이얼로그가 닫히면 문장이 출력됨
//				System.out.println("다이얼로그 닫힘.");
			}
		});
		
		pnl.add(tfR);
		pnl.add(tfG);
		pnl.add(tfB);
		pnl.add(btn);
		pnl.add(lbl);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class Main {
	public static void main(String[] args) {
		new MainFrame();
	}
}
