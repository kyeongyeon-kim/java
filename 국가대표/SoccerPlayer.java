/*
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


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SoccerPlayer {
	private int backNumber;
	private String playerName;
	List<SoccerPlayer> playerList;
	
	public SoccerPlayer() {
		playerList = new ArrayList<>(Arrays.asList(
			new SoccerPlayer(1, "김승규"),
			new SoccerPlayer(2, "윤종규"),
			new SoccerPlayer(3, "김진수"),
			new SoccerPlayer(4, "김민재"),
			new SoccerPlayer(5, "정우영"),
			new SoccerPlayer(6, "황인범"),
			new SoccerPlayer(7, "손흥민"),
			new SoccerPlayer(8, "백승호"),
			new SoccerPlayer(9, "조규성"),
			new SoccerPlayer(10, "이재성"),
			new SoccerPlayer(11, "황희찬"),
			new SoccerPlayer(12, "송범근"),
			new SoccerPlayer(13, "손준호"),
			new SoccerPlayer(14, "홍철"),
			new SoccerPlayer(15, "김문환"),
			new SoccerPlayer(16, "황의조"),
			new SoccerPlayer(17, "나상호"),
			new SoccerPlayer(18, "이강인"),
			new SoccerPlayer(19, "김영권"),
			new SoccerPlayer(20, "권경원"),
			new SoccerPlayer(21, "조현우"),
			new SoccerPlayer(22, "권창훈"),
			new SoccerPlayer(23, "김태환"),
			new SoccerPlayer(24, "조유민"),
			new SoccerPlayer(25, "정우영"),
			new SoccerPlayer(26, "송민규")));
	}
	
	public SoccerPlayer(int backNumber, String playerName) {
		super();
		this.backNumber = backNumber;
		this.playerName = playerName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + backNumber;
		result = prime * result + ((playerName == null) ? 0 : playerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof SoccerPlayer))
			return false;
		SoccerPlayer other = (SoccerPlayer) obj;
		if (backNumber != other.backNumber)
			return false;
		if (playerName == null) {
			if (other.playerName != null)
				return false;
		} else if (!playerName.equals(other.playerName))
			return false;
		return true;
	}

	public int getBackNumber() {
		return backNumber;
	}
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	@Override
	public String toString() {
		return "국가대표 [등번호 : " + backNumber + ", 선수 이름 : " + playerName + "]";
	}
}
