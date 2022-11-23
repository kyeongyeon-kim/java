class Animal {
	private String type;
	private int age;
	private Zookeeper zooKeeper; // private String name;
	
	public Animal(String type, int age, Zookeeper zooKeeper) {
		this.type = type;
		this.age = age;
		this.zooKeeper = zooKeeper;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Zookeeper getZooKeeper() {
		return zooKeeper;
	}

	public void setZooKeeper(Zookeeper zooKeeper) {
		this.zooKeeper = zooKeeper;
	}


}