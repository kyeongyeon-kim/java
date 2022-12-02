import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class ClickMe extends JFrame implements MouseListener {
	public ClickMe() {
		JPanel pn1 = new JPanel();
		pn1.setLayout(null);
		pn1.setPreferredSize(new Dimension(500, 500));
		JButton btn = new JButton("Click Me");
		btn.setBounds(150, 150, 100, 100);
		
		btn.addMouseListener(this);
		
		pn1.add(btn);
		
		add(pn1);
		
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 창 내의 마우스 좌표
//		System.out.println("x좌표 :  " + e.getX());
//		System.out.println("y좌표 :  " + e.getY());
		// 모니터 내의 마우스 좌표
//		System.out.println("x on Screen :  " + e.getXOnScreen());
//		System.out.println("y on Screen :  " + e.getYOnScreen());
		
		// 왼쪽버튼인지 아닌지 (더 유용하다 !)
		System.out.println(SwingUtilities.isLeftMouseButton(e));		
		
		// 마우스의 어느 버튼을 눌렀는지(고정값이 아닌 마우스 설정값에 따라감, 각 마우스들의 버튼 개수 시스템이 다르기때문에)
		System.out.println(e.getButton());
		System.out.println("클릭count : " + e.getClickCount());
		
		System.out.println("마우스 클릭!");
	}

	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("사용자의 마우스 버튼이 눌렸습니다.");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
//		System.out.println("사용자의 마우스 버튼이 떼어졌습니다.");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
//		System.out.println("마우스 커서가 버튼 안으로 위치했습니다.");
	}

	@Override
	public void mouseExited(MouseEvent e) {
//		System.out.println("마우스 커서가 버튼 밖으로 위치했습니다.");
	}

}


public class Main {

	public static void main(String[] args) {
		new ClickMe();
	}

}
