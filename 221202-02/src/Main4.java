import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
// 체크박스, 버튼 같은 부모의 상속 구조

class TestCheckBox extends JFrame implements ActionListener, ItemListener {
	public TestCheckBox() {
		JPanel pn1 = new JPanel();
		JCheckBox chk1 = new JCheckBox("첫번째 선택지");
		JCheckBox chk2 = new JCheckBox("두번째 선택지");
		JCheckBox chk3 = new JCheckBox("세번째 선택지");
		
		chk1.addActionListener(this);
		//아이템 이벤트
		chk1.addItemListener(this);
		
		pn1.add(chk1);
		pn1.add(chk2);
		pn1.add(chk3);
		
		add(pn1);
		
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o instanceof JCheckBox) {
			JCheckBox source = (JCheckBox) o;
			boolean isSelected = source.isSelected();
			System.out.println(isSelected ? "선택됨" : "해제됨");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		e.getSource();
		int state = e.getStateChange();
		// 1번 선택, 2번 해제
		if (state == ItemEvent.SELECTED) {
			System.out.println("선택");
		} else if (state == ItemEvent.DESELECTED) {
			System.out.println("해제");
		}
	}
}
public class Main4 {

	public static void main(String[] args) {
		new TestCheckBox();
	}

}
