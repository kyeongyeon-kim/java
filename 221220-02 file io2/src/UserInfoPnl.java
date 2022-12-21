
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class UserInfoPnl extends JPanel {
	private JLabel lblName;
	private JLabel lblPhone;
	private JTextField tfName;
	private JTextField tfPhone;

	public UserInfoPnl(String name, String phone) {
		setPreferredSize(new Dimension(400, 100));
		SpringLayout springLayout = new SpringLayout();
		setLayout(springLayout);
		
		lblName = new JLabel("이름");
		springLayout.putConstraint(SpringLayout.NORTH, lblName, 20, SpringLayout.NORTH, this);
		springLayout.putConstraint(SpringLayout.WEST, lblName, 10, SpringLayout.WEST, this);
		add(lblName);
		
		lblPhone = new JLabel("전화번호");
		springLayout.putConstraint(SpringLayout.NORTH, lblPhone, 25, SpringLayout.SOUTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, lblPhone, 10, SpringLayout.WEST, this);
		add(lblPhone);
		
		tfName = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfName, 0, SpringLayout.NORTH, lblName);
		springLayout.putConstraint(SpringLayout.WEST, tfName, 6, SpringLayout.EAST, lblName);
		springLayout.putConstraint(SpringLayout.EAST, tfName, -10, SpringLayout.EAST, this);
		add(tfName);
		tfName.setColumns(10);
		
		tfPhone = new JTextField();
		springLayout.putConstraint(SpringLayout.WEST, tfPhone, 6, SpringLayout.EAST, lblPhone);
		springLayout.putConstraint(SpringLayout.EAST, tfPhone, -10, SpringLayout.EAST, this);
		springLayout.putConstraint(SpringLayout.NORTH, tfPhone, 0, SpringLayout.NORTH, lblPhone);
		add(tfPhone);
		tfPhone.setColumns(10);
		
		setUserName(name);
		setUserPhone(phone);
	}
	
	public void setUserName(String name) {
		tfName.setText(name);
	}
	
	public void setUserPhone(String phone) {
		tfPhone.setText(phone);
	}
	
	public String getUserName() {
		return tfName.getText();
	}
	
	public String getUserPhone() {
		return tfPhone.getText();
	}
}
