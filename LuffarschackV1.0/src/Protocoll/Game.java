package Protocoll;

public class Game {
	//Methods
	public String CreateGameStart(boolean starting){}
	public String CreateYourTurnString(int x, int y){}
	public String CreateTimeUppdateString(int p1time, int p2time){}
	public String CreateMoveString(String userName, int x, int y){}
	public String CreateIlligalMoveString(){}
	public String CreateGameEnd(Bool victory){}
	public int[] ExtractGameTime(String requestString){}
	public String[] ExtractMove(String requestedString){}
	public boolean ExtractVictory(string requestedString){}
	public boolean EextractStarting(String reqestString){}
}
