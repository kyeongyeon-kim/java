class Player {
	private int backNum;
	private String name;
	
	public Player(int backNum, String name) {
		super();
		this.backNum = backNum;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Player [backNum=" + backNum + ", name=" + name + "]";
	}
	public int getBackNum() {
		return backNum;
	}
	public void setBackNum(int backNum) {
		this.backNum = backNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}