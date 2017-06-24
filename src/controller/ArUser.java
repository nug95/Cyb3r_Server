package controller;

import java.util.ArrayList;

import model.User;

public class ArUser {

	private ArrayList<User> arUser;

	public ArUser() {
		super();
		this.arUser = new ArrayList<User>();
	}

	public ArrayList<User> getArUser() {
		return arUser;
	}

	public void setArUser(ArrayList<User> arUser) {
		this.arUser = arUser;
	}
	
}
