import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/*
 	11명의 선발명단을 짤 수 있게 사용자에게 모든 선수 명단을 보여주고,
 	입력(등번호 or 이름) → 선발명단에 추가 (중복 불가)
 	반복 → 11명이 가득차면 최종명단을 볼 수 있어야함.
 	
	1 김승규
	12 송범근
	21 조현우
	20 권경원
	15 김문환
	4 김민재
	19 김영권
	3 김진수
	23 김태환
	2 윤종규
	24 조유민
	14 홍철
	22 권창훈
	17 나상호
	8 백승호
	13 손준호
	7 손흥민
	26 송민규
	18 이강인
	10 이재성
	5 정우영
	25 정우영
	6 황인범
	11 황희찬
	9 조규성
	16 황의조
*/

class Player {
	private int number;
	private String name;
	private boolean starting = false;
	public Player(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStarting() {
		return starting;
	}
	public void setStarting(boolean starting) {
		this.starting = starting;
	}
	@Override
	public String toString() {
		return number + " " + name;
	}
}

class KorTeam extends JFrame implements ItemListener, ActionListener {
	private JCheckBox[] checkPlayers;
	private List<Player> playerList;
	private JList list;
	private JTextField tfInput;
	private JButton btnEnter;
	private JButton btnAdd;
	private JButton btnDelete;
	private DefaultListModel model;
	private int possible = 0;
	private int selected = 0;
	private JLabel lblpossible;
	private JLabel lblselected;
	
	public KorTeam() {
		super("'4강 가자'는 꿈이었습니다.");
		
		// 선수명단 작성
		playerList = new ArrayList<>(Arrays.asList(
				new Player(1, "김승규"), new Player(12, "송범근"), new Player(21, "조현우"),
				new Player(20, "권경원"), new Player(15, "김문환"), new Player(4, "김민재"),
				new Player(19, "김영권"), new Player(3, "김진수"), new Player(23, "김태환"),
				new Player(2, "윤종규"), new Player(24, "조유민"), new Player(14, "홍철"),
				new Player(22, "권창훈"), new Player(17, "나상호"), new Player(8, "백승호"),
				new Player(13, "손준호"), new Player(7, "손흥민"), new Player(26, "송민규"),
				new Player(18, "이강인"), new Player(10, "이재성"), new Player(5, "정우영"),
				new Player(25, "정우영"), new Player(6, "황인범"), new Player(11, "황희찬"),
				new Player(9, "조규성"), new Player(16, "황의조")));
		
		// 탭 선언
		JTabbedPane tab = new JTabbedPane();
			
		// 패널선언
		JPanel pnl1 = new JPanel();
		JPanel pnlNorth = new JPanel();
		JPanel pnlWest = new JPanel();	
		JPanel pnlCenter = new JPanel();
		
		// 패널 레이아웃 선택
		pnl1.setLayout(new BorderLayout());
		pnlNorth.setLayout(new FlowLayout());
		pnlCenter.setLayout(new FlowLayout());
		pnlWest.setLayout(new BoxLayout(pnlWest, BoxLayout.Y_AXIS));
		
		// pnlNorth 구성요소
		JLabel lbl = new JLabel("선발 명단에 추가할 선수의 이름 또는 등번호를 입력하세요.");
		tfInput = new JTextField(30);
		btnEnter = new JButton("등록");
		pnlNorth.add(lbl);
		pnlNorth.add(tfInput);
		pnlNorth.add(btnEnter);
		btnEnter.addActionListener(this);
		tfInput.addActionListener(this);
		
		// pnlWest 구성요소
		checkPlayers = new JCheckBox[playerList.size()];
		for (int i = 0; i < checkPlayers.length; i++) {
			checkPlayers[i] = new JCheckBox(playerList.get(i).toString());
			pnlWest.add(checkPlayers[i]);
			checkPlayers[i].addItemListener(this);
		}
		pnlWest.add(Box.createHorizontalStrut(100));
		
		// pnlCenter 구성요소
		JLabel lblp = new JLabel("추가 가능한 선수:  ");
		lblpossible = new JLabel("11");
		JLabel lbls = new JLabel("추가된 선수:  ");
		lblselected = new JLabel("0");
		model = new DefaultListModel();
		list = new JList(model);
		list.setPreferredSize(new Dimension(300, 200));
		btnAdd = new JButton("추가");
		btnDelete = new JButton("제외");
		pnlCenter.add(lblp);
		pnlCenter.add(lblpossible);
		pnlCenter.add(lbls);
		pnlCenter.add(lblselected);
		pnlCenter.add(list);
		pnlCenter.add(btnAdd);
		pnlCenter.add(btnDelete);
		btnAdd.addActionListener(this);
		btnDelete.addActionListener(this);
		
		// pnl 구성요소
		pnl1.add(pnlNorth, "North");
		pnlNorth.setPreferredSize(new Dimension(0, 60));
		pnl1.add(pnlWest, "West");
		pnl1.add(pnlCenter, "Center");
		
		tab.add(pnl1, "선발선택");
		tab.add(new IdealType().getPnl(), "이상형월드컵");
		
		add(tab);
		
		
		setSize(500, 750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void showGUI() {
		setVisible(true);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		int count = 0;
		for (int i = 0; i < checkPlayers.length; i++) {
			if (checkPlayers[i].isSelected()) {
				count++;
			}
		}
		if (count > 11) {
			JOptionPane.showMessageDialog(null, "선발선수는 11명까지 선택할 수 있습니다.", "입력 초과", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object command = e.getSource();
		if (command == tfInput || command == btnEnter) {
			String input = tfInput.getText();
			int index = -3;
			try {
				int inputNum = Integer.valueOf(input);
				index = searchByNumber(playerList, inputNum);
			} catch(NumberFormatException exception) {
				index = searchByName(playerList, input);
			} 
			if (index >= 0 && !playerList.get(index).isStarting() && selected < 11) {
				model.addElement(playerList.get(index).toString());
				playerList.get(index).setStarting(true);
			} else if(index == -2) {
				JOptionPane.showMessageDialog(null, "이름이 같은 선수가 여러명 존재합니다. 등번호로 입력해 주세요.", "같은 이름이 존재", JOptionPane.ERROR_MESSAGE);
			} else if(index == -1) {
				JOptionPane.showMessageDialog(null, "존재하지 않는 선수입니다.", "잘못된 입력", JOptionPane.WARNING_MESSAGE);
			} else if(playerList.get(index).isStarting()) {
				JOptionPane.showMessageDialog(null, "이미 등록된 선수입니다.", "잘못된 입력", JOptionPane.WARNING_MESSAGE);
			} else if (selected >= 11) {
				JOptionPane.showMessageDialog(null, "이미 11명이 모두 선택되었습니다.", "입력 초과", JOptionPane.WARNING_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "선수명단에 없습니다.", "잘못된 입력", JOptionPane.WARNING_MESSAGE);
			}
			tfInput.setText("");
		}
		if (command == btnAdd) {
			int already = 0;
			int over = 0;
			for (int i = 0; i < checkPlayers.length; i++) {
				if (checkPlayers[i].isSelected() && !playerList.get(i).isStarting() && selected < 11) {
					model.addElement(playerList.get(i).toString());
					playerList.get(i).setStarting(true);
				} else if (selected >= 11) {
					over++;
				} else if (checkPlayers[i].isSelected() && playerList.get(i).isStarting()) {
					already++;
				}
				checkPlayers[i].setSelected(false);
			}
			if (over > 0 ) {
				JOptionPane.showMessageDialog(null, "이미 11명이 모두 선택되었습니다.", "입력 초과", JOptionPane.WARNING_MESSAGE);
			} else if (already > 0) {
				JOptionPane.showMessageDialog(null, "이미 등록된 명단은 제외하고 추가되었습니다.", "알림", JOptionPane.CLOSED_OPTION);
			}
		}
		if (command == btnDelete) {
			for (int i = 0; i < model.getSize(); i++) {
				if (list.isSelectedIndex(i)) {
					String temp = model.get(i).toString();
					String name = temp.subSequence(temp.length() - 3, temp.length()).toString();
					for (int j = 0; j < playerList.size(); j++) {
						if (playerList.get(j).getName().equals(name)) {
							playerList.get(j).setStarting(false);
						}
					}
					model.remove(i);
				}
			}
		}
		selected = model.getSize();
		possible = 11 - selected;
		lblpossible.setText(String.valueOf(possible));
		lblselected.setText(String.valueOf(selected));
	}
	
	public int searchByName(List<Player> list, String name) {
		int num = 0;
		int search = 0;
		for (int i = 0; i < list.size(); i++) {
			Player p = list.get(i);
			if (p.getName().equals(name)) {
				num = i;
				search++;
			}
		}
		if (search == 1) {
			return num;
		} else if (search >= 2) {
			return -2;
		}
		return -1;
	}
	
	public int searchByNumber(List<Player> list, int num) {
		for (int i = 0; i < list.size(); i++) {
			Player p = list.get(i);
			if (p.getNumber() == num) {
				return i;
			}
		}
		return -1;
	}	
}

class IdealType extends JFrame implements ActionListener {
	private List<Player> playerList;
	private JPanel pnl;
	private JButton btnStart;
	private JButton btn1;
	private JLabel lbl1;
	private JButton btn2;
	private JLabel lbl2;
	private List<Player> copy;
	private List<Player> result;
	private JLabel lblRound;
	private int count = 0;
	
	public IdealType() {
		playerList = new ArrayList<>(Arrays.asList(
				new Player(1, "김승규"), new Player(12, "송범근"), new Player(21, "조현우"),
				new Player(20, "권경원"), new Player(15, "김문환"), new Player(4, "김민재"),
				new Player(19, "김영권"), new Player(3, "김진수"), new Player(23, "김태환"),
				new Player(2, "윤종규"), new Player(24, "조유민"), new Player(14, "홍철"),
				new Player(22, "권창훈"), new Player(17, "나상호"), new Player(8, "백승호"),
				new Player(13, "손준호"), new Player(7, "손흥민"), new Player(26, "송민규"),
				new Player(18, "이강인"), new Player(10, "이재성"), new Player(5, "정우영"),
				new Player(25, "정우영"), new Player(6, "황인범"), new Player(11, "황희찬"),
				new Player(9, "조규성"), new Player(16, "황의조")));
		
		copy = new ArrayList();
		result = new ArrayList();

		pnl = new JPanel();
		JPanel pnlNorth = new JPanel();
		JPanel pnlWest = new JPanel();
		JPanel pnlCenter = new JPanel();
		JPanel pnlSouth = new JPanel();
		
		pnl.setLayout(new BorderLayout());
		pnlWest.setLayout(new FlowLayout());
		pnlCenter.setLayout(new FlowLayout());
		
		JLabel lblTitle = new JLabel("엔트리선수 이상형 월드컵");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 25));
		lblRound = new JLabel("26강전");
		JLabel lblHelp = new JLabel("아래 두 선수 중 한명을 선택하세요.");
		pnlNorth.add(lblTitle);
		pnlNorth.add(lblRound);
		pnlNorth.add(lblHelp);
		
		btn1 = new JButton();
		btn1.setPreferredSize(new Dimension(230, 230));
		btn1.addActionListener(this);
		lbl1 = new JLabel();
		lbl1.setFont(new Font("굴림", Font.BOLD, 20));
		pnlWest.add(Box.createHorizontalStrut(40));
		pnlWest.add(btn1);
		pnlWest.add(lbl1);
		
		btn2 = new JButton();
		btn2.setPreferredSize(new Dimension(230, 230));
		btn2.addActionListener(this);
		lbl2 = new JLabel();
		lbl2.setFont(new Font("굴림", Font.BOLD, 20));
		pnlCenter.add(btn2);
		pnlCenter.add(lbl2);

		
		btnStart = new JButton("시작");
		btnStart.setPreferredSize(new Dimension(200, 50));
		pnlSouth.add(btnStart);
		btnStart.addActionListener(this);
		
		pnl.add(pnlNorth, "North");
		pnlNorth.setPreferredSize(new Dimension(0, 60));
		pnl.add(pnlWest, "West");
		pnlWest.setPreferredSize(new Dimension(240, 0));
		pnl.add(pnlCenter, "Center");
		pnl.add(pnlSouth, "South");
		pnlSouth.setPreferredSize(new Dimension(0, 300));
		
		add(pnl);
	}
	public JPanel getPnl() {
		return pnl;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object command = e.getSource();
		if (command == btnStart) {
			count = 0;
			copy.clear();
			copy.addAll(playerList);
			result.clear();
			Collections.shuffle(copy);
			selectIdeal();
		}
		
		if (command == btn1) {
			if (count >= 4) {
				JOptionPane.showMessageDialog(null, lbl1.getText() + " 선수가 당신의 최종 선택입니다.", "이상형", JOptionPane.NO_OPTION);
				copy.clear();
				result.clear();
				btn1.setIcon(null);
				btn2.setIcon(null);
				lbl1.setText("");
				lbl2.setText("");
				count = 0;
			} else {
				try {
					result.add(copy.get(0));
					copy.remove(0);
					copy.remove(0);
					selectIdeal();
				} catch(IndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "시작버튼을 먼저 눌러주세요!!", "알림!", JOptionPane.WARNING_MESSAGE);
				}
			}
		} else if (command == btn2) {
			if (count >= 4) {
				JOptionPane.showMessageDialog(null, lbl2.getText() + " 선수가 당신의 최종 선택입니다.", "이상형", JOptionPane.NO_OPTION);
				copy.clear();
				result.clear();	
				btn1.setIcon(null);
				btn2.setIcon(null);
				lbl1.setText("");
				lbl2.setText("");
				count = 0;
			} else {
				try {
					result.add(copy.get(1));
					copy.remove(0);
					copy.remove(0);
					selectIdeal();
				} catch(IndexOutOfBoundsException error) {
					JOptionPane.showMessageDialog(null, "시작버튼을 먼저 눌러주세요!!", "알림!", JOptionPane.WARNING_MESSAGE);
				}			
			}
		}
	}
	
	public void selectIdeal() {
		if (copy.size() > 0) {
			String name1 = copy.get(0).getNumber() + copy.get(0).getName() + ".png";;
			String name2 = copy.get(1).getNumber() + copy.get(1).getName() + ".png";;
			
			Toolkit kit = Toolkit.getDefaultToolkit();
			ClassLoader classLoader = getClass().getClassLoader();
			Image image1 = kit.getImage(classLoader.getResource(name1));
			image1 = image1.getScaledInstance(230, 230, Image.SCALE_SMOOTH);
			Image image2 = kit.getImage(classLoader.getResource(name2));
			image2 = image2.getScaledInstance(230, 230, Image.SCALE_SMOOTH);
			
			ImageIcon icon1 = new ImageIcon(image1);
			ImageIcon icon2 = new ImageIcon(image2);
			
			btn1.setIcon(icon1);
			btn2.setIcon(icon2);
			lbl1.setText(copy.get(0).toString());
			lbl2.setText(copy.get(1).toString());
		} else if (copy.size() == 0) {
			JOptionPane.showMessageDialog(null, result.size() + "강전이 시작됩니다.", "토러먼트", JOptionPane.NO_OPTION);
			lblRound.setText(String.valueOf(result.size()) + "강전");			
			count++;
			copy.clear();
			copy.addAll(result);
			result.clear();
			if (copy.size() % 2 != 0) {
				result.add(copy.get(copy.size() - 1));
				copy.remove(copy.size() - 1);
			}
			selectIdeal();
		}
	}
}

public class Practice4 {
	public static void main(String[] args) {
		new KorTeam().showGUI();
	}
}

