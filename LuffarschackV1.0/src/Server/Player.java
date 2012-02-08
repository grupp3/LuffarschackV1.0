package Server;

/**
 * @author  Kamil
 */
public class Player {
	
	//variables
	private boolean validated;
	private boolean playing;
	private String userName;
	private String password;
	/**
	 * @uml.property  name="activeRequests"
	 * @uml.associationEnd  
	 */
	private Request activeRequests;
}
