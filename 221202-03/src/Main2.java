import javax.swing.JOptionPane;

public class Main2 {
	public static void main(String[] args) {
//		Dialog에서 옵션페이지가 만들어져있음
//		JOptionPane.showMessageDialog(null, "메세지 보여주기");
//		JOptionPane.showMessageDialog(null, "경고 내용", "제목", JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null, "에러 내용", "에러", JOptionPane.ERROR_MESSAGE);
		
		String name = JOptionPane.showInputDialog("이름이 뭐니?");
		if (name == null) {
			JOptionPane.showMessageDialog(null, "에러 내용", "에러", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, name + "환영");
		}
	}
}
