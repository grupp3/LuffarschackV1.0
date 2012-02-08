package klient;

import javax.swing.JLabel;

public class Game {
	//Variables
	private JLabel lbl_p1time, lbl_p2time, lbl_p1name, lbl_p2name;
	private grd_playinField;
	
	//Methods
	public void Game(ServerConnection conection){}
	public void IllegalMove(){}
	public void OpponentMove(int x, int y){}
	public void uppdateTime(int p1time, int p2time){}
}
