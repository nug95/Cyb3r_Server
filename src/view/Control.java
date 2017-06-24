package view;

import controller.ArPlayer;
import controller.ArUser;
import controller.ArUserType;

public class Control {

	//ArrayLists
	private ArUserType 	servUsersTypes;
	private ArUser		servUsers;
	private ArPlayer	servPlayer;
	
	public Control()
	{
		this.servUsersTypes = new ArUserType();
		this.servUsers		= new ArUser();
		this.servPlayer		= new ArPlayer();
	}
}
