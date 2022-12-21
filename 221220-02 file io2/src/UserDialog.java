
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private UserInfoPnl userInfoPnl;
	private String userName;
	private String userPhone;
	private boolean completed;
	private UserInputEventListener listener;
	
	public UserDialog() {
		setModal(true);
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		userInfoPnl = new UserInfoPnl((String) null, (String) null);
		contentPanel.add(userInfoPnl);
		
		JPanel buttonPane = new JPanel();
		buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		
		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userName = userInfoPnl.getUserName();
				userPhone = userInfoPnl.getUserPhone();
				listener.userInputCompleted(new UserInputEvent(userName, userPhone));
				dispose();
			}
		});
		buttonPane.add(okButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		buttonPane.add(cancelButton);
	}

	public boolean showInput() {
		setVisible(true);
		return completed;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getUserPhone() {
		return userPhone;
	}

	public void addUserInputEventListener(UserInputEventListener listener) {
		this.listener = listener;
	}
}











