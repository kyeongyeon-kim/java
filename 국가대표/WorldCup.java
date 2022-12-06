/*
 	11명의 선발 명단을 짤 수 있게끔 사용자에게 모든 선수 명단을 보여주고,
 	입력(등번호 or 이름) -> 선발명단에 추가 (이미 추가한 선수 중복 추가 불가능)
  	반복 => 11명이 가득차면 최종명단을 볼 수 있어야함.
*/

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
class SelectPlayer extends JFrame {

	SoccerPlayer player = new SoccerPlayer();
	JTextField backNumOrName;
	JPanel panel_2;
	JPanel panel_2_2;
	List<SoccerPlayer> team = new ArrayList<>();
	int count = 0;

	public SelectPlayer() {
		JPanel panel_1 = new JPanel();
		JLabel title = new JLabel("원하는 선수 11명을 뽑아 팀을 구성해 보세요. (등번호 또는 이름을 입력하세요.)");
		title.setFont(new Font("굴림", Font.BOLD, 25));

		panel_1.add(title);

		panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		JPanel panel_2_1 = new JPanel(new GridLayout(9, 3, 30, 30));
		panel_2_1.setBackground(Color.WHITE);
		JLabel line = new JLabel(" >>>> ");
		line.setFont(new Font("굴림", Font.BOLD, 15));
		panel_2_2 = new JPanel(new GridLayout(11, 1, 15, 15));
		panel_2_2.setBackground(Color.WHITE);

		for (int i = 0; i < player.playerList.size(); i++) {
			SoccerPlayer p = player.playerList.get(i);
			String strP = p.getBackNumber() + "." + p.getPlayerName();
			JLabel lbl = new JLabel(strP);
			lbl.setFont(new Font("굴림", Font.PLAIN, 15));
			panel_2_1.add(lbl);
		}

		panel_2.add(panel_2_1);
		panel_2.add(Box.createHorizontalStrut(60));
		panel_2.add(line);
		panel_2.add(Box.createHorizontalStrut(60));
		panel_2.add(panel_2_2);
		panel_2.add(Box.createHorizontalStrut(150));

		JPanel panel_3 = new JPanel();
		backNumOrName = new JTextField(30);
		backNumOrName.setFont(new Font("굴림", Font.BOLD, 15));
		JButton add = new JButton("추가");
		JButton delete = new JButton("삭제");

		panel_3.add(Box.createHorizontalStrut(30));
		panel_3.add(backNumOrName);
		panel_3.add(Box.createHorizontalStrut(50));
		panel_3.add(add);
		panel_3.add(Box.createHorizontalStrut(50));
		panel_3.add(delete);

		JPanel box = new JPanel();
		box.setLayout(new BoxLayout(box, BoxLayout.Y_AXIS));

		box.add(Box.createGlue());
		box.add(panel_1);
		box.add(panel_2);
		box.add(Box.createGlue());
		box.add(panel_3);
		box.add(Box.createGlue());

		add(box);

		backNumOrName.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
			}

			@Override
			public void keyReleased(KeyEvent e) {
			}

			@Override
			public void keyPressed(KeyEvent e) {

				int code = e.getKeyCode();

				if (code == KeyEvent.VK_ENTER) {
					inputPlayer(backNumOrName.getText());
				}
			}
		});

		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inputPlayer(backNumOrName.getText());
			}
		});

		delete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				playerOut(backNumOrName.getText());

			}
		});

		setSize(1000, 750);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public void inputPlayer(String inputStr) {

		try {
			boolean contain = false;

			if (count < 11) {
				if (overLapCheck(inputStr)) {

					for (int i = 0; i < player.playerList.size(); i++) {

						int playerNum = player.playerList.get(i).getBackNumber();
						String playerName = player.playerList.get(i).getPlayerName();
						String inputLine;

						if (playerNum < 10) {
							inputLine = playerNum + ".   " + playerName;
						} else {
							inputLine = playerNum + ". " + playerName;
						}

						if (isNumberFormat(inputStr)) {
							if (playerNum == Integer.parseInt(inputStr)) {
								count++;
								team.add(new SoccerPlayer(playerNum, playerName));
								inputLabel(inputLine);
								contain = true;
								break;
							}
						} else if (playerName.equals(inputStr)) {
							count++;
							team.add(new SoccerPlayer(playerNum, playerName));
							inputLabel(inputLine);

							contain = true;
							break;
						} else {
							continue;
						}
					}

					if (!contain) {
						inputErrorMessage();
					}
				} else {
					overLapErrorMessage();
				}
			} else {
				if (backNumOrName.getText().equals("")) {
					inputErrorMessage();
				} else {
					fullTeamErrorMessage();
				}
			}
		} catch (NumberFormatException e) {
			inputErrorMessage();
		}
	}

	public void inputLabel(String inputLine) {

		JLabel lbl = new JLabel(inputLine);
		lbl.setFont(new Font("굴림", Font.BOLD, 15));
		panel_2_2.add(lbl);
		backNumOrName.setText("");
		panel_2_2.revalidate();
		panel_2_2.repaint();
	}

	public void playerOut(String inputStr) {

		try {
			boolean contain = false;
			
			if (count > 0) {

				for (int i = 0; i < team.size(); i++) {

					int playerNum = team.get(i).getBackNumber();
					String playerName = team.get(i).getPlayerName();

					if (isNumberFormat(inputStr)) {
						if (playerNum == Integer.parseInt(inputStr)) {
							count--;
							team.remove(i);
							deleteLabel();
							contain = true;
							break;
						}
					} else if (playerName.equals(inputStr)) {
						count--;
						team.remove(i);
						deleteLabel();
						contain = true;
						break;
					} else {
						continue;
					}
				}

				if (!contain) {
					inputErrorMessage();
				}
			} else {
				if (backNumOrName.getText().equals("")) {
					inputErrorMessage();
				} else {
					emptyTeamErrorMessage();
				}
			}
		} catch (NumberFormatException e) {
			inputErrorMessage();
		}
	}

	public void deleteLabel() {

		panel_2_2.removeAll();

		for (int i = 0; i < team.size(); i++) {

			int playerNum = team.get(i).getBackNumber();
			String playerName = team.get(i).getPlayerName();
			String inputLine;
			if (playerNum < 10) {
				inputLine = playerNum + ".   " + playerName;
			} else {
				inputLine = playerNum + ". " + playerName;
			}

			JLabel lbl = new JLabel(inputLine);
			lbl.setFont(new Font("굴림", Font.BOLD, 15));
			panel_2_2.add(lbl);
		}

		panel_2_2.revalidate();
		panel_2_2.repaint();
		backNumOrName.setText("");
	}

	public boolean isNumberFormat(String inputStr) {

		try {
			Integer.parseInt(inputStr);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public boolean overLapCheck(String inputStr) {

		boolean check = true;

		for (int i = 0; i < team.size(); i++) {

			int playerNum = team.get(i).getBackNumber();
			String playerName = team.get(i).getPlayerName();

			if (isNumberFormat(inputStr)) {
				if (playerNum == Integer.parseInt(inputStr)) {

					check = false;
					break;
				}
			} else if (playerName.equals(inputStr)) {
				check = false;
				break;
			} else {
				continue;
			}
		}

		return check;
	}

	public void inputErrorMessage() {

		backNumOrName.setText("");
		JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.", "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void fullTeamErrorMessage() {

		backNumOrName.setText("");
		JOptionPane.showMessageDialog(null, "선수 11명 모두 선택 했습니다.", "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void emptyTeamErrorMessage() {
		backNumOrName.setText("");
		JOptionPane.showMessageDialog(null, "팀원이 아무도 없습니다.", "Error", JOptionPane.ERROR_MESSAGE);
	}

	public void overLapErrorMessage() {
		backNumOrName.setText("");
		JOptionPane.showMessageDialog(null, "이미 선택한 선수 입니다.", "Error", JOptionPane.ERROR_MESSAGE);
	}
}

public class WorldCup {
	public static void main(String[] args) {

		new SelectPlayer();
	}
}