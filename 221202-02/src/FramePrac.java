import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import java.awt.Component;
import javax.swing.Box;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;

public class FramePrac extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FramePrac frame = new FramePrac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FramePrac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("피자의 기본가격 : 10000");
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.EAST);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		Component glue_5 = Box.createGlue();
		panel_2.add(glue_5);
		
		JLabel lblNewLabel_1 = new JLabel("현재가격");
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("10000");
		panel_2.add(lblNewLabel_2);
		
		Component glue_6 = Box.createGlue();
		panel_2.add(glue_6);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		Component glue_2 = Box.createGlue();
		panel_1.add(glue_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("파인애플 추가(+2000원)");
		panel_1.add(chckbxNewCheckBox);
		
		Component glue = Box.createGlue();
		panel_1.add(glue);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("올리브 추가(+1000원)");
		panel_1.add(chckbxNewCheckBox_1);
		
		Component glue_1 = Box.createGlue();
		panel_1.add(glue_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("민트초코 추가(+1000원)");
		panel_1.add(chckbxNewCheckBox_2);
		
		Component glue_3 = Box.createGlue();
		panel_1.add(glue_3);
	}

}
