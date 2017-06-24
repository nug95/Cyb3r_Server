package model;

public class Server {
	
	private String	program_title;
	private boolean	usersCanLog;
	private boolean usersCanReg;
	
	private String	server_IP;
	private int		server_port;
	
	public Server(String program_title, boolean usersCanLog, boolean usersCanReg, String server_IP, int server_port) {
		super();
		this.program_title = program_title;
		this.usersCanLog = usersCanLog;
		this.usersCanReg = usersCanReg;
		this.server_IP = server_IP;
		this.server_port = server_port;
	}

	public String getProgram_title() {
		return program_title;
	}

	public void setProgram_title(String program_title) {
		this.program_title = program_title;
	}

	public boolean isUsersCanLog() {
		return usersCanLog;
	}

	public void setUsersCanLog(boolean usersCanLog) {
		this.usersCanLog = usersCanLog;
	}

	public boolean isUsersCanReg() {
		return usersCanReg;
	}

	public void setUsersCanReg(boolean usersCanReg) {
		this.usersCanReg = usersCanReg;
	}

	public String getServer_IP() {
		return server_IP;
	}

	public void setServer_IP(String server_IP) {
		this.server_IP = server_IP;
	}

	public int getServer_port() {
		return server_port;
	}

	public void setServer_port(int server_port) {
		this.server_port = server_port;
	}
	
}
