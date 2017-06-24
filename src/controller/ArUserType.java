package controller;

import java.util.ArrayList;

import model.UserType;

public class ArUserType {

	private ArrayList<UserType> arUserType;

	public ArUserType() {
		super();
		this.arUserType = new ArrayList<UserType>();
	}

	public ArrayList<UserType> getArUserType() {
		return arUserType;
	}

	public void setArUserType(ArrayList<UserType> arUserType) {
		this.arUserType = arUserType;
	}
	
}
