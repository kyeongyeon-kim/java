import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class TestKey extends JFrame {
	public TestKey() {
		JPanel pn1 = new JPanel();
		JTextField tf = new JTextField(10);
		
		tf.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// 글자만! 방향키는 인식하지 않음
//				System.out.println("글자가 하나 typing 되었음");
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// 문자를 가져와줌
//				char ch = e.getKeyChar();
//				System.out.println(ch + "를 입력함");
//				System.out.println("키를 뗌");
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// 키에 맞는 정수를 가져와줌
//				int code = e.getKeyCode();
//				if (code == KeyEvent.VK_A) {
//					System.out.println("A를 누름");
//				}
//				System.out.println("키를 누름");
				// getKeyText 메소드는 정수를 텍스트로 출력해주어 우리가 읽기쉽게 해준다.
				int code = e.getKeyCode();
				System.out.println(KeyEvent.getKeyText(code));
				
			}
		});
		
		pn1.add(tf);
		add(pn1);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
public class Main {
	public static void main(String[] args) {
		new TestKey();
	}
}
