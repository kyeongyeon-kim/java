import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TextEnterFrame extends JFrame implements ActionListener {
	
	private JTextField tf;
	private JButton btn;
	public TextEnterFrame() {
		JPanel pn1 = new JPanel();
		tf = new JTextField(10);
		btn = new JButton("버튼");
		
		// textField에도 리스너를 붙일 수 있다.
		pn1.add(tf);
		pn1.add(btn);
		
		add(pn1);
		
		tf.addActionListener(this);
		btn.addActionListener(this);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
	// 엔터를 눌렀는지 어떤 버튼을 눌렀는지 => e.getSource 객체의 참조를 알려줌
	// 참조가 같은지 비교 ( 관계 연산자 활용 "==" )
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (tf == source) {
			System.out.println("텍스트필드에서 액션이벤트 발생");
		} else if (btn == source) {
			System.out.println("버튼에서 액션이벤트 발생");
		}
	}
}

public class Main3 {

	public static void main(String[] args) {
		new TextEnterFrame().showGUI();
	}

}
