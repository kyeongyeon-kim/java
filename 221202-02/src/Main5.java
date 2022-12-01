import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class OrderPizza extends JFrame implements ActionListener, ItemListener {
	private JCheckBox chPineapple;
	private JCheckBox chOlive;
	private JCheckBox chMint;
	private JLabel result;
	private Random random = new Random();

	public OrderPizza() {
		JPanel pn1 = new JPanel();
		JPanel pn2 = new JPanel();
		JPanel pn3 = new JPanel();
		JPanel pn4 = new JPanel();
		
		JRadioButton pepperPizza = new JRadioButton("페퍼로니");
		JRadioButton cheesePizza = new JRadioButton("치즈");
		JRadioButton bulgogiPizza = new JRadioButton("불고기");
		ButtonGroup group = new ButtonGroup();
		group.add(pepperPizza);
		group.add(cheesePizza);
		group.add(bulgogiPizza);
		pepperPizza.setSelected(true);
		
		chPineapple = new JCheckBox("파인애플 추가 +2000원");
		chPineapple.addItemListener(this);
		chOlive = new JCheckBox("올리브 추가 +1000원");
		chOlive.addItemListener(this);
		chMint = new JCheckBox("민트초코 추가 +3000원");
		chMint.addItemListener(this);
		pn2.add(Box.createGlue());
		pn2.add(chPineapple);
		pn2.add(Box.createGlue());
		pn2.add(chOlive);
		pn2.add(Box.createGlue());
		pn2.add(chMint);
		pn2.add(Box.createGlue());
		
		pn4.add(Box.createGlue());
		pn4.add(pepperPizza);
		pn4.add(Box.createGlue());
		pn4.add(cheesePizza);
		pn4.add(Box.createGlue());
		pn4.add(bulgogiPizza);
		pn4.add(Box.createGlue());
		
		chPineapple.setAlignmentX(0.3F);
		chOlive.setAlignmentX(0.3F);
		chMint.setAlignmentX(0.3F);
		
		JLabel lb1 = new JLabel("피자의 기본가격 : 10000");
		pn1.add(lb1);
		JLabel lb2 = new JLabel("현재가격");
		result = new JLabel("10000");
		
		JButton selectAll = new JButton("전체선택");
		JButton cancelAll = new JButton("취소");
		JButton randomBtn = new JButton("랜덤");
		selectAll.addActionListener(this);
		cancelAll.addActionListener(this);
		randomBtn.addActionListener(this);
		
		
		//체크박스 체크 상태 설정 setCheckBox
		pn3.add(Box.createGlue());
		pn3.add(lb2);
		pn3.add(result);
		pn3.add(selectAll);
		pn3.add(cancelAll);
		pn3.add(randomBtn);
		pn3.add(Box.createGlue());
		
		lb2.setAlignmentX(LEFT_ALIGNMENT);
		result.setAlignmentX(LEFT_ALIGNMENT);
		
		BoxLayout box = new BoxLayout(pn2, BoxLayout.Y_AXIS);
		pn2.setLayout(box);
		BoxLayout box2 = new BoxLayout(pn3, BoxLayout.Y_AXIS);
		pn3.setLayout(box2);
		BoxLayout box3 = new BoxLayout(pn4, BoxLayout.Y_AXIS);
		pn4.setLayout(box3);
	
		add(pn1, "North");
		add(pn2, "Center");
		add(pn3, "East");
		add(pn4, "West");
		
		setSize(400, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int price = calculator();
		result.setText(String.valueOf(price));
	}
	
	public int calculator() {
		int price = 10000;
		price += chPineapple.isSelected() ? 2000 : 0;
		price += chOlive.isSelected() ? 1000 : 0;
		price += chMint.isSelected() ? 3000 : 0;
		return price;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if (command.equals("전체선택")) {
			chPineapple.setSelected(true);
			chOlive.setSelected(true);
			chMint.setSelected(true);
		} else if (command.equals("취소")) {
			chPineapple.setSelected(false);
			chOlive.setSelected(false);
			chMint.setSelected(false);
		} else if (command.equals("랜덤")) {
			chPineapple.setSelected(random.nextInt(2) == 1? true : false);
			chOlive.setSelected(random.nextInt(2) == 1? true : false);
			chMint.setSelected(random.nextInt(2) == 1? true : false);
		}
	}
}
public class Main5 {
	public static void main(String[] args) {
		new OrderPizza();
	}

}
