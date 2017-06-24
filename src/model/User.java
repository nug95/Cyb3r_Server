package model;

public class User {

	private int		ID;
	private String	username,
					password;
	private UserType type;
	private boolean isOnline;
	private boolean isDeleted;
	public User(int iD, String username, String password, UserType type, boolean isOnline, boolean isDeleted) {
		super();
		ID = iD;
		this.username = username;
		this.password = password;
		this.type = type;
		this.isOnline = isOnline;
		this.isDeleted = isDeleted;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserType getType() {
		return type;
	}
	public void setType(UserType type) {
		this.type = type;
	}
	public boolean isOnline() {
		return isOnline;
	}
	public void setOnline(boolean isOnline) {
		this.isOnline = isOnline;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	
}
