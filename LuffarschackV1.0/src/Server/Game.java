package Server;

/**
 * @author  Kamil
 */
public class Game {
	//variables
	private int timelimit;
	private int p1TimeLeft;
	private int p2TimeLeft;
	/**
	 * @uml.property  name="player1"
	 * @uml.associationEnd  
	 */
	private PlayerConnection player1;
	/**
	 * @uml.property  name="player2"
	 * @uml.associationEnd  
	 */
	private PlayerConnection player2;
	private int[][] field;
	
	//methods
	public void Game(dBHandler dbhandler, List<Game> gameList){}
	public void Start(){}
	public void AddMove(Player player){}
	public bool CheckVisitory(Player player){}
}