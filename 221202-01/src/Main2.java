import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 마우스 어댑터 클래스
// 클래스 생성 후 내가 원하는 마우스 동작만 오버라이딩 후 사용한다.
// java에서는 클래스를 클래스 내부에서 사용가능할 수 있다.
// MyMouseAdapter 클래스는 ClickMe2가 생성되면 멤버처럼 접근이 가능하게 된다.

class ClickMe2 extends JFrame {
	
	private int count;
	// 보통은 내부에서 사용하기위해서 생성한다.(그래서 보통 private를 붙인다.)
	private class MyMouseAdapter extends MouseAdapter {
		// 지역클래스에서 선언된 변수는 외부에서 접근할 수 없다.
//		int innerField;
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("사용자가 클릭함");
			// 지역클래스에서는 밖에 있는 클래스의 변수를 자기 것처럼 사용이 가능하다.
			count++;
			// 메소드 내부에도 클래스가 존재할 수 있다. 메소드에서만 사용하기위해 생성된다.
		}
	}
	
	public ClickMe2() {
		// 마우스의 어댑터의 상속을받은 익명의 클래스가 생기고, 인스턴스가 생성되는 것을 볼 수 있다. 대신 중괄호를 붙이고 사용해야한다.
		// 생성자는 만들 수 없고, 변수 메소드는 가능

		JPanel pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setPreferredSize(new Dimension(500, 500));
		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("액션 이벤트 동작 구현");
			}
		});
		
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.out.println("사용자가 클릭함");
				//밖 클래스에 접근하려면 해당 클래스명의 this로 접근이 가능함
				ClickMe2.this.count++;
			}
		});
		
		pn1.add(btn);
		
		add(pn1);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class Main2 {
	public static void main(String[] args) {
		ClickMe3 frame = new ClickMe3();
		// 인스턴스 접근 후 생성 가능
//		MouseAdapter adapter = frame.new MyMouseAdapter();
	}

}
