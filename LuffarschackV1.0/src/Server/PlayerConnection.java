package Server;

/**
 * @author  Kamil
 */
public class PlayerConnection {
	//variables
	private ClientSocket socket;
	/**
	 * @uml.property  name="playerList"
	 * @uml.associationEnd  
	 */
	private Players playerList;
	/**
	 * @uml.property  name="player"
	 * @uml.associationEnd  
	 */
	private Player player;
	private DatabaseHandles dBHandler;
	
	//methods
	public void start(){}
	public void PlayerConnection(List<String> playerList, Player player, DatabaseHandles databashandler){}
	public void Send (RequestType requestType){}
	public void sendUserList(List<String> users){}
	public void SendGameRequest(String sendingUser, int timelimit){};
	public void SendGameStart()
	public void sendGameStart(boolean starting){}
	public void sentTime(int p1time, int p2time){}
	public void EndGame(boolean winner){}
	public void YourTurn(int x, int y){}
	public void IllegalMove(){}
}