import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 창
// 글자가 표현 되도록 (버튼을 누르는 것이 아닌)

class MyFrame extends JFrame implements ActionListener {
	private JLabel lb1Number;
	private int number;
	
	public MyFrame() {
		number = 1;
		
		JPanel pn1 = new JPanel();
		add(pn1);
		
		// 생성자에서 초기화 가능 세터도 사용 가능
		JLabel lb1 = new JLabel("안녕하세요~");
		pn1.add(lb1);
		
		lb1Number = new JLabel(String.valueOf(number));
		pn1.add(lb1Number);
		
		// 카운트 1++ 버튼
		JButton btnIncrese = new JButton("카운트");
		btnIncrese.addActionListener(this);
		pn1.add(btnIncrese);
		
		// 감소 1-- 버튼
		JButton btnDecrese = new JButton("감소");
		btnDecrese.addActionListener(this);
		pn1.add(btnDecrese);
		
		// 리셋 1로  리셋 버튼
		JButton btnReset = new JButton("리셋");
		btnReset.addActionListener(this);
		pn1.add(btnReset);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
	// 버튼을 누를 때마다 1씩 증가하는 동작
	// 레퍼 클래스 활용
	// 초기 생성자에서 정수값을 스트링으로 파라미터에 넣어준 후 클릭시 1증가한 값이 라벨에 적용되게 끔
	// 커맨드는 버튼에 입력된 자료를 인식하여 동작한다.
	// 레이블은 사용자가 보기만 가능한 텍스트
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("카운트")) {
			number++;
		} else if (command.equals("감소")) {
			number--;
		} else if (command.equals("리셋")) {
			number = 1;
		}
//		String text = lb1Number.getText();
//		int number = Integer.parseInt(text);
		lb1Number.setText(String.valueOf(number));
		 
	}
	
}

public class Main {
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.showGUI();
	}

}
