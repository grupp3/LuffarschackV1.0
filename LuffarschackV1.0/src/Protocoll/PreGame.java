package Protocoll;

public class PreGame {
	//Methods
	public String CreateLoginString(String userName, String password){}
	public String CreateRegisterString(String userName, String password){}
	public String CreateLoggedinString(){}
	public String CreateLoginFailedString(){}
	public String CreateRegisterFailedString()}
	public String CreateGameRequest(String userName, String targetUser, int timelimit){}
	public String CreateGameRequest(String fromUserName, int timelimit){}
	public String CreateAbbortGameRequest(String userName, String targetUser){}
	public String CreateGameRequestResponse(String userName, String targetUser, Enum_GameRequest response){}
	public String CreateHighscoreList(String[][] highscoreList){}
	public String CreateHistoryRequest(PlayedGame[] games){}
	public String CreateHistoryList(){}
	public RequestType GetTypeFromRequest(String requestString){}
	public String[] ExtractUsernamePassword(String requeStstring){}
	public String[] ExtractPlayerList(String requestString){}
	public String[] ExtractGameRequest(String requestString){}
	public String[][] ExtractHigscoreList(String requestString){}
	public Enum_GameRequest ExtractGameRequestResponse(String requestString){}
	public PlayedGame[] ExtractHistoryList(String requestString){}
}
