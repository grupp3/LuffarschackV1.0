package Server;

/**
 * @author  Kamil
 */
public class Game {
	//variables
	private int timelimit;
	private int p1TimeLeft;
	private int p2TimeLeft;
	private PlayerConnection player1;
	private PlayerConnection player2;
	private int[][] field;
	
	//methods
	public void Game(DatabaseHandler dbhandler, List<Game> gameList){}
	public void Start(){}
	public void AddMove(Player player){}
	public boolean CheckVisitory(Player player){}
}