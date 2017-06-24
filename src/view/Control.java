package view;

import controller.ArPlayer;
import controller.ArUser;
import controller.ArUserType;
import model.Server;
import model.User;
import model.UserType;

public class Control {
	
	//Server Model
	private Server cyb3r_server;

	//ArrayLists
	private ArUserType 	servUsersTypes;
	private ArUser		servUsers;
	private ArPlayer	servPlayer;
	
	/**
	 * Var used to check if user is logged or not
	 */
	private boolean isUserLogged;
	
	public Control()
	{
		if(getCyb3r_server() == null)
		{
			setCyb3r_server(new Server("Cyb3r Server", true, true, "127.0.0.1", 3322));
		}
		
		this.servUsersTypes = new ArUserType();
		this.servUsers		= new ArUser();
		this.servPlayer		= new ArPlayer();
		
		//Init to false;
		setUserLogged(false);
		
		
		if(!isUserLogged() && getCyb3r_server().isUsersCanLog())
		{
			ServerLogin sl = new ServerLogin(getCyb3r_server());
			sl.setVisible(true);
		}
		else if(!isUserLogged() && !getCyb3r_server().isUsersCanLog())
		{
			ServerClose sc = new ServerClose(getCyb3r_server());
			sc.setVisible(true);
		}
		
	}

	public ArUserType getServUsersTypes() {
		return servUsersTypes;
	}

	public void setServUsersTypes(ArUserType servUsersTypes) {
		this.servUsersTypes = servUsersTypes;
	}

	public ArUser getServUsers() {
		return servUsers;
	}

	public void setServUsers(ArUser servUsers) {
		this.servUsers = servUsers;
	}

	public ArPlayer getServPlayer() {
		return servPlayer;
	}

	public void setServPlayer(ArPlayer servPlayer) {
		this.servPlayer = servPlayer;
	}

	public boolean isUserLogged() {
		return isUserLogged;
	}

	public void setUserLogged(boolean isUserLogged) {
		this.isUserLogged = isUserLogged;
	}

	public Server getCyb3r_server() {
		return cyb3r_server;
	}

	public void setCyb3r_server(Server cyb3r_server) {
		this.cyb3r_server = cyb3r_server;
	}
	
}
