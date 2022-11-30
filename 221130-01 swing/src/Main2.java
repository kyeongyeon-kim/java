import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 생성자에서 정수를 입력하면 가로 텍스트창의 가로길이 설정이 가능하다.
// 텍스트 필드 2개와 버튼을 하나 만들어 계산 값이 나올 수 있도록 만들기 
// 퀵픽스 메뉴 컨트롤 + 1

class TextInputFrame extends JFrame implements ActionListener {
	private JTextField left;
	private JTextField right;
	private JLabel lb1Result;

	public TextInputFrame() {
		JPanel pn1 = new JPanel();
		
		left = new JTextField(3);
		right = new JTextField(3);
		JButton btnSum = new JButton("+");
		lb1Result = new JLabel("0");
		
		pn1.add(left);
		pn1.add(right);
		pn1.add(btnSum);
		pn1.add(lb1Result);
		
		add(pn1);
		btnSum.addActionListener(this);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
	// 입력받은 두 값 정수 형태로 > sum > 다시 스트링타입으로 변경
	// 예외적인 상황 대응 (모든 상황에서 예외가 발생하면 안되기에
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 동작 확인");
		try {
			int leftNum = Integer.parseInt(left.getText());
			int rightNum = Integer.parseInt(right.getText());
			int sum = leftNum + rightNum;
			lb1Result.setText(String.valueOf(sum));
		} catch (NumberFormatException excep) {
			lb1Result.setText("정수를 입력해야합니다.");
		}
	}
}

public class Main2 {
	public static void main(String[] args) {
		new TextInputFrame().showGUI();
	}
}
