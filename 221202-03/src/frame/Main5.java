package frame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


class QuizFrame extends JFrame {
	Random random = new Random();
	int count = 0;
	private JLabel score;
	private int num1;
	private int num2;
	private JLabel quiz;
	private int sum;
	private JTextField input;
	
	class SubFrame extends JDialog {
		
		public SubFrame() {
			JPanel main = new JPanel();
			JLabel answerOrWrong = new JLabel("정답입니다.");
			JButton btnOK = new JButton("확인");
			main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
			answerOrWrong.setAlignmentX(CENTER_ALIGNMENT);
			btnOK.setAlignmentX(CENTER_ALIGNMENT);
			
			btnOK.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					num1 = random.nextInt(100);
					num2 = random.nextInt(100);
					sum = num1 + num2;
					quiz.setText("Quiz" + "(" + (count + 1) + ")    " + num1 + " + " + num2 + "=  ?");
					input.setText("");
					dispose();
				}
			});
			main.add(Box.createHorizontalStrut(1));
			main.add(answerOrWrong);
			main.add(Box.createHorizontalStrut(1));
			main.add(btnOK);
			main.add(Box.createHorizontalStrut(1));
			
			pack();
			add(main);
			setModal(true);
			setSize(300, 200);
			setVisible(true);
			setLocationRelativeTo(null);
		}
	}
	
	public QuizFrame() {
		JPanel main = new JPanel();
		JPanel north = new JPanel();
		JPanel center = new JPanel();
		JPanel south = new JPanel();
		main.setLayout(new GridLayout(3, 1));
		
		num1 = random.nextInt(100);
		num2 = random.nextInt(100);
		sum = num1 + num2;
		
		quiz = new JLabel("Quiz" + "(" + (count + 1) + ")    " + num1 + " + " + num2 + " =  ?");
		north.add(quiz);
		
		input = new JTextField(8);
		JButton btn = new JButton("제출");
		center.add(input);
		center.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int answer = Integer.parseInt(input.getText());
				if (answer == sum) {
					SubFrame sub = new SubFrame();
					count++;
					String showScore = String.valueOf(count);
					score.setText("현재까지 점수 : " + showScore);
					quiz.setText("Quiz" + "(" + (count + 1) + ")    " + num1 + " + " + num2 + " =  ?");
				} else {
					JOptionPane.showMessageDialog(null, "오답입니다.", "오답", JOptionPane.INFORMATION_MESSAGE);
					count = 0;
					quiz.setText("Quiz" + "(" + (count + 1) + ")    " + num1 + " + " + num2 + " =  ?");
					input.setText("");
					score.setText("현재까지 점수 : 0");
				}
				
			}
		});
		
		score = new JLabel("현재까지 점수 : 0");
		south.add(score);
		
		main.add(north);
		main.add(center);
		main.add(south);
		
		add(main);
		
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
	}
}

public class Main5 {
	public static void main(String[] args) {
		new QuizFrame();
	}
}
