package controller;

import java.util.ArrayList;

import model.Player;

public class ArPlayer {

	private ArrayList<Player> arPlayer;

	public ArPlayer() {
		super();
		this.arPlayer = new ArrayList<Player>();
	}

	public ArrayList<Player> getArPlayer() {
		return arPlayer;
	}

	public void setArPlayer(ArrayList<Player> arPlayer) {
		this.arPlayer = arPlayer;
	}
	
}
