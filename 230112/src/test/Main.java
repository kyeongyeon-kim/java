package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

interface 명령처리자 {
	결과 처리();
}

class 첫번째명령처리자 implements 명령처리자 {
	@Override
	public 결과 처리() {
		return new 결과("첫번째결과");
	}
	
}

class 두번째명령처리자 implements 명령처리자 {
	@Override
	public 결과 처리() {
		return new 결과("두번째결과");
	}
}

class 결과 {
	private String message;

	public 결과(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}

public class Main implements ActionListener {
	private Map<String, 명령처리자> 처리자맵;
	
	public Main() {
		super();
		처리자맵 = new HashMap<>();
		처리자맵.put("명령어1번", new 첫번째명령처리자());
		처리자맵.put("명령어2번", new 두번째명령처리자());
	}

	public void 사용자명령처리하기(String 명령어) {
		// 처리자찾기
		명령처리자 inst = 처리자맵.get(명령어);
		// 처리자보고 명령하기
		결과 result = inst.처리();
		// 결과 사용하기
		System.out.println(result.getMessage());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		사용자명령처리하기(command);
	}
	public static void main(String[] args) {
		Main main = new Main();
		main.사용자명령처리하기("명령어1번");
		main.사용자명령처리하기("명령어2번");
	}
}

