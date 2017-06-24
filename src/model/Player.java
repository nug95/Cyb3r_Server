package model;

public class Player {

	private int		ID;
	private User	user;
	
	private String	nickname,
					email;

	private float	money;
	private int		bitCoin;
	public Player(int iD, User user, String nickname, String email, float money, int bitCoin) {
		super();
		ID = iD;
		this.user = user;
		this.nickname = nickname;
		this.email = email;
		this.money = money;
		this.bitCoin = bitCoin;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getMoney() {
		return money;
	}
	public void setMoney(float money) {
		this.money = money;
	}
	public int getBitCoin() {
		return bitCoin;
	}
	public void setBitCoin(int bitCoin) {
		this.bitCoin = bitCoin;
	}
	
}
