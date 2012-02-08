/**
 * 
 */
package klient;

import javax.swing.JFrame;

import Protocoll.Game;
import Protocoll.PlayedGame;

/**
 * @author Tiger
 *
 */
public class WindowHandler {
	//variables
	private JFrame LoginScreen, Lobby, History;
	private Game game;
	
	//Methods
	public static void main(String[] args){}
	
	public void Switch(Enm_Windows targetWindow){}
	public void LoggedIn(){}
	public void LogginFailed(){}
	public void RegisterFailed(){}
	public void ActiveUserList(String[] users){}
	public void GetGameRequest(String fromUserName, int timeLimit){}
	public void GameStart(boolean starting){}
	public void YourTurn(int x, int y){}
	public void IllegalMove(){}
	public void uppdateTime(int p1time, int p2Time){}
	public void gameEnd(boolean victory){}
	public void uppdateScores(String[][] unknownName){}
	public void uppdateHistory(PlayedGame[] playerGame){}	
}
