import javax.swing.JOptionPane;

public class Main3 {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog
							(null, "확인용 다이얼로그", "제목", JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) {
		
		} else if (option == JOptionPane.NO_OPTION) {
			
		} else if (option == JOptionPane.CANCEL_OPTION) {
			
		}
	}
}
