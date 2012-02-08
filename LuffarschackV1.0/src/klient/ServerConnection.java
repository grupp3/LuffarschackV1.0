package klient;

import java.net.Socket;

import Protocoll.Enum_GameRequest;

public class ServerConnection {
	//Variables
	private Socket conection;
	private String username, password;
	
	//Methods
	public void Start(){}
	public void Loggin(String userName, String password){}
	public void Register(String userName, String password){}
	public void RequestGame(String targetUser, int timelimit){}
	public void AbortGameRequest(){}
	public void GameRequestResponse(String targetUser, Enum_GameRequest GameRequest){}
	public void SendMove(int x, int y){}
	public void RequestHistory(){}
}
