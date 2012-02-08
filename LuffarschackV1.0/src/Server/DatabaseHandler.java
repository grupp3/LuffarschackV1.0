package Server;

public class DatabaseHandler {
	//Methods
	public boolean RegisterUser(String userName, Sring password){}
	public boolean RegisterGame(String userName1, String userName2, String whoWod, int timeLimit){}
	public List<PlayedGame> getHistory(String userName){}
	public boolean ValidateUser(String userName, String password){}
	public void AddGame(String player1, String player2, String, DateTime dateTime, int timeLimit){}
	public String[][] getHighScoreList(){}
	public PlayedGame[] GetHistory(String userName){}
}