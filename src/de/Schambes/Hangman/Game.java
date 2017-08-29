package de.Schambes.Hangman;

import de.Schambes.Hangman.GUI.RegistryFrame;

public class Game {
	
	private de.Schambes.Hangman.Player[] players;
	
	public static void main(String[] args) {
		new RegistryFrame();
	}
	
	public void setPlayers(de.Schambes.Hangman.Player[] players) {
		//TODO player registration exception if invalid
		this.players = players;
	}
	
}
