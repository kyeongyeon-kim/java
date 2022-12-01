import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// 라디오 버튼
class TestRadio extends JFrame implements ActionListener, ItemListener {
	public TestRadio() {
		JRadioButton radio1 = new JRadioButton("첫번째 라디오");
		JRadioButton radio2 = new JRadioButton("두번째 라디오");
		JRadioButton radio3 = new JRadioButton("세번째 라디오");
		// 창이 켜질 때 라디오1이 켜진 상태로 시작
		radio1.setSelected(true);
		radio1.addActionListener(this);
		radio1.addItemListener(this);
		
		// 라디오버튼은 그룹이 되기전엔 따로 동작하지만, 그룹이 된 후에는 서로 상호작용을 하게 된다.
		ButtonGroup group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		JPanel pn1 = new JPanel();
		pn1.add(radio1);
		pn1.add(radio2);
		pn1.add(radio3);
		
		add(pn1);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("1번 라디오버튼의 상태가 변경되었음.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1번 라디오버튼을 눌렀음.");
	}
}
public class Main6 {

	public static void main(String[] args) {
		new TestRadio();
	}

}
