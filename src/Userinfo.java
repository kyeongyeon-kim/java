public class Userinfo {
	private int id;
	private String email;
	private String fistname;
	private String lastname;
	
	public Userinfo(int id, String email, String fistname, String lastname) {
		super();
		this.id = id;
		this.email = email;
		this.fistname = fistname;
		this.lastname = lastname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Userinfo [id=" + id + ", email=" + email + ", fistname=" + fistname + ", lastname=" + lastname + "]";
	}
	
}
